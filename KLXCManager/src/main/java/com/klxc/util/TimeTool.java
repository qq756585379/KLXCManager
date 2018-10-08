package com.klxc.util;

import com.klxc.tool.UtilTool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTool {

    private final static String FORMAT = "yyyy-MM-dd HH:mm:ss";
    private final static SimpleDateFormat sf2 = new SimpleDateFormat(FORMAT);

    private static SimpleDateFormat sf;

    public static long minute = 60 * 1000;
    private static long day = 24 * 60 * 60 * 1000;

    public static String formatDateTime(Date date, String format) {
        try {
            if (date != null) {
                sf = new SimpleDateFormat(format);
                return sf.format(date);
            }
        } catch (Exception e) {

        }
        return "";
    }

    public static Date fomatStringToDate(String date, String format) {
        if (!UtilTool.isNull(date)) {
            try {
                sf = new SimpleDateFormat(format);
                return sf.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static String formatDateTime(Date date) {
        try {
            if (date != null) {
                return sf2.format(date);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String formatShortDateTime(Date date) {
        try {
            if (date != null) {
                String time = formatDateTime(date);
                return UtilTool.substring(time, 0, 10);
            }
        } catch (Exception e) {

        }
        return "";
    }

    public static String getYesterday(Date date) {
        try {
            if (date != null) {
                date.setTime(date.getTime() - day);
                String time = formatDateTime(date);
                return UtilTool.substring(time, 0, 10);
            }
        } catch (Exception e) {

        }
        return "";
    }

    public static String getLastDay(Date date, int num) {
        try {
            if (date != null) {
                date.setTime(date.getTime() - day * num);
                String time = formatDateTime(date);
                return UtilTool.substring(time, 0, 10);
            }
        } catch (Exception e) {

        }
        return "";
    }
}
