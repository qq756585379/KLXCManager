package com.klxc.tool.sms;

import com.klxc.tool.UtilTool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class SMS {
    static final String content = "【数天科技】您的注册验证码是:%s，5分钟内使用有效。";
    static final String comid = "2465";
    static final String username = "shutian123";
    static final String userpwd = "2zgat5ex";
    static final String sendtime = "";
    static final String smsnumber = "10690";

    static final String urlStr = "http://jiekou.56dxw.com/sms/HttpInterface.aspx?comid=%s&username=%s"
            + "&userpwd=%s&handtel=%s&sendcontent=%s&sendtime=%s&smsnumber=%s";

    public static int sendSms(String mobile, String radam) {
        String sendcontent = String.format(content, radam);
        String urlS = String.format(urlStr, comid, username, userpwd, mobile, sendcontent, sendtime, smsnumber);
        System.out.println("sRet   is:   " + urlS);
        try {
            sendcontent = java.net.URLEncoder.encode(sendcontent, "gbk");
            URL url = new URL(urlS);
            HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
            httpCon.connect();
            BufferedReader in = new BufferedReader(new InputStreamReader(httpCon.getInputStream()));
            String line = in.readLine();
            System.out.println(" </p>     result:   " + line);
            int i_ret = httpCon.getResponseCode();
            String sRet = httpCon.getResponseMessage();
            System.out.println("sRet   is:   " + sRet);
            System.out.println("i_ret   is:   " + i_ret);
            return 0;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static String getRandom() {
        String str = "" + (Math.random() * 9000 + 1000);
        return UtilTool.substring(str, 0, 4);
    }

    public static void main(String[] args) throws Exception {
        sendSms("18217243728", "2222");
    }
}
