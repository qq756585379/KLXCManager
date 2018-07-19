package com.klxc.tool;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;

public class RequestTool {

    public static String getString(HttpServletRequest request, String name) {
        return UtilTool.toString(request.getParameter(name));
    }

    public static String getStringEncode(HttpServletRequest request, String name) {
        String str = UtilTool.toString(request.getParameter(name));
        try {
            str = new String(str.getBytes("iso-8859-1"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return str;
    }

    public static int getInt(HttpServletRequest request, String name) {
        return UtilTool.toInteger(request.getParameter(name));
    }

    public static float getFloat(HttpServletRequest request, String name) {
        return UtilTool.toFloat(request.getParameter(name));
    }

    public static void populate(HttpServletRequest request, Object t) {
        try {
            BeanUtils.populate(t, request.getParameterMap());
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
