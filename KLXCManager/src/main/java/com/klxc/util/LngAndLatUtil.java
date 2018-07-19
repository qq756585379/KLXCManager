package com.klxc.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class LngAndLatUtil {

    public static Map<String, Double> getLngAndLat(String address) {

        Map<String, Double> map = new HashMap<String, Double>();

        try {
            String url = "http://api.map.baidu.com/geocoder/v2/?address=" + address + "&output=json&ak=OK3jsKi0ohtfsZDQjDIww3Vgw3K0y6jE";
            String json = loadJSON(url);
            JSONObject obj = JSON.parseObject(json);
            if (obj.get("status").toString().equals("0")) {
                double lng = obj.getJSONObject("result").getJSONObject("location").getDouble("lng");
                double lat = obj.getJSONObject("result").getJSONObject("location").getDouble("lat");
                map.put("lng", lng);
                map.put("lat", lat);
                System.out.println("经度：" + lng + "---纬度：" + lat);
            } else {
                System.out.println("未找到相匹配的经纬度！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    private static String loadJSON(String url) {
        StringBuilder json = new StringBuilder();
        try {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            String inputLine = null;
            while ((inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
        } catch (MalformedURLException e) {

        } catch (IOException e) {

        }
        return json.toString();
    }

    public static void main(String[] args) {
        Map<String, Double> map = LngAndLatUtil.getLngAndLat("上海市奉贤区五四公路4399号");
        System.out.println("经度：" + map.get("lng") + "," + map.get("lat"));

        Map<String, Double> map1 = LngAndLatUtil.getLngAndLat("上海龙阳路地铁站");
        System.out.println("经度：" + map1.get("lng") + "," + map1.get("lat"));

        XYmatch.getDistance(map.get("lat"), +map.get("lng"), map1.get("lat"), map1.get("lng"));
    }
}
