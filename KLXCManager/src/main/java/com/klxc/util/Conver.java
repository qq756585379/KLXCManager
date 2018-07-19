package com.klxc.util;

import com.klxc.tool.UtilTool;

import java.util.ArrayList;
import java.util.List;

public class Conver {

    private static Conver task;
    private List<String> src;
    private List<String> out;

    private Conver() {
        init();
    }

    public static Conver getInstance() {
        if (task == null) {
            synchronized (Conver.class) {
                if (task == null) {
                    task = new Conver();
                }
            }
        }
        return task;
    }

    private void init() {
        src = new ArrayList<String>();
        out = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            src.add(i + "");
        }

        out.add(7 + "");
        out.add(5 + "");
        out.add(9 + "");
        out.add(1 + "");
        out.add(3 + "");
        out.add(6 + "");
        out.add(8 + "");
        out.add(0 + "");
        out.add(2 + "");
        out.add(4 + "");
    }

    public String encode(String str) {
        if (src == null || src.size() <= 0 || src == null || src.size() <= 0) {
            return str;
        }
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += out.get(src.indexOf(str.substring(i, i + 1)));
        }
        int num = UtilTool.toInteger(result);
        return Integer.toHexString(num).toUpperCase();
    }

    public String decrypt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += src.get(out.indexOf(str.substring(i, i + 1)));
        }
        return str;
    }

    public static void main(String[] args) {
        String s = Conver.getInstance().encode("10002");
        System.out.println(s);
        String a = Conver.getInstance().decrypt(s);
        System.out.println(s);
    }
}