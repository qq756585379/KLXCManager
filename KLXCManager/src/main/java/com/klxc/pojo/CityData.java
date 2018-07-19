package com.klxc.pojo;

import com.klxc.tool.UtilTool;

public class CityData {
    public static final int type_area = 0;
    public static final int type_city = 1;

    public static String getCity(String province, String city, String area) {
        String str = "";
        if (!UtilTool.isNull(province)) {
            str += province;
        }
        if (!UtilTool.isNull(city)) {
            str += "-" + city;
        }
        if (!UtilTool.isNull(area)) {
            str += "-" + area;
        }
        return str;
    }

    public static String getCity(String province, String city) {
        return getCity(province, city, "");
    }

    public static String getCityName(String province, String city) {
        String str = "";
        if ("市辖区".equals(city) || "县".equals(city) || "市".equals(city)) {
            str = province;
        } else {
            if (!UtilTool.isNull(city)) {
                str = city.replace("市", "");
            } else {
                str = city;
            }
        }
        return str;
    }

    public static String getCode(int userId) {
        return userId + getRandom();
    }

    private static String getRandom() {
        String str = "" + (Math.random() * 900000 + 100000);
        System.out.println(str);
        str = UtilTool.replace(str, ".", "");
        return UtilTool.substring(str, 0, 6);
    }
}
