package com.klxc.tool;

import java.util.List;

public class UtilTool {

    public static boolean isNull(String str) {
        if (str == null || "".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean isExtNull(List<?> list) {
        if (list == null || list.isEmpty() || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean isExtNull(String[] obj) {
        if (obj == null || obj.length == 0) {
            return true;
        }
        return false;
    }

    public static String toString(Object obj) {
        if (obj != null && !"".equals(obj)) {
            return obj.toString();
        }
        return "";
    }

    public static String substring(String obj, int start, int end) {
        if (obj != null && !"".equals(obj)) {
            if (obj.length() >= start && obj.length() >= end && end >= start) {
                return obj.substring(start, end);
            } else {
                return obj;
            }
        }
        return "";
    }

    public static String substring(String obj, int start) {
        if (obj != null && !"".equals(obj)) {
            if (obj.length() >= start) {
                return obj.substring(start);
            } else {
                return obj;
            }
        }
        return "";
    }

    public static String replace(String obj) {
        if (obj != null && !"".equals(obj)) {
            return obj.replace("'", "''");
        } else {
            return obj;
        }
    }

    public static String replace(String obj, String oldChar, String newChar) {
        if (obj != null && !"".equals(obj)) {
            return obj.replace(oldChar, newChar);
        } else {
            return obj;
        }
    }

    public static String replaceAll(String obj, String oldChar, String newChar) {
        if (obj != null && !"".equals(obj)) {
            return obj.replaceAll(oldChar, newChar);
        } else {
            return obj;
        }
    }

    public static double toDouble(Object obj) {
        try {
            if (obj != null && !"".equals(obj)) {
                return Double.parseDouble(obj.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0.0;
    }

    public static float toFloat(Object obj) {
        if (obj != null && !"".equals(obj)) {
            return Float.parseFloat(obj.toString());
        }
        return 0.0f;
    }

    public static int toInteger(Object obj) {
        try {
            if (obj != null && !"".equals(obj)) {
                return Integer.parseInt(obj.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static boolean toBoolean(Object obj) {
        if (obj != null && !"".equals(obj)) {
            return Boolean.parseBoolean(obj.toString());
        }
        return false;
    }

    public static long toLong(Object obj) {
        try {
            if (obj != null && !"".equals(obj)) {
                return Long.parseLong(obj.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int validateLength(String value) {
        if (isNull(value)) {
            return 0;
        }
        int valueLength = 0;
        String chinese = "[\u4e00-\u9fa5]";
        for (int i = 0; i < value.length(); i++) {
            String temp = substring(value, i, i + 1);
            if (temp.matches(chinese)) {
                valueLength += 2;
            } else {
                valueLength += 1;
            }
        }
        return valueLength;
    }
}
