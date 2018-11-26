package com.klxc.util;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class XYmatch {
    private static double EARTH_RADIUS = 6378.137;

    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }

    public static void getDistance(double la1, double ln1, double la2, double ln2) {
        double jieguo = setDistance(la1, ln1, la2, ln2);
        double jieguo2 = jieguo * 1000;
        double jieguo3 = Math.round(jieguo2);
        DecimalFormat df = new DecimalFormat("#####0.0");
        DecimalFormat dfa = new DecimalFormat("#####0");
        if (jieguo3 >= 1000) {
            System.out.println(df.format(jieguo3 / 1000) + "公里");
        } else {
            System.out.println(dfa.format(jieguo3) + "米");
        }
    }

    public static double setDistance(double la1, double ln1, double la2, double ln2) {
        double radLat1 = rad(la1);
        double radLat2 = rad(la2);
        double a = radLat1 - radLat2;
        double b = rad(ln1) - rad(ln2);
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(radLat1) * Math.cos(radLat2) * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        return s;
    }

    /**
     * 计算两个经纬度之间的距离
     */
    public static void main(String[] args) {
        double y1 = 26.398582267739;
        double x1 = 106.2554089653;
        double y2 = 31.179819344057;
        double x2 = 121.55991255833;
    }
}
