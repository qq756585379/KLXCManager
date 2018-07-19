package com.klxc.pojo;

public class ClassData {

    //班级类型；1：自营计时；2：自营非计时；11：合作计时；12：合作非计时；
    public static String getTypeDesc(int class_type) {
        String typeDesc = "";
        switch (class_type) {
            case 1:
                typeDesc = "自营计时";
                break;
            case 2:
                typeDesc = "自营非计时";
                break;
            case 3:
                typeDesc = "自营计时和非计时";
                break;
            case 11:
                typeDesc = "合作计时";
                break;
            case 12:
                typeDesc = "合作非计时";
                break;
            case 13:
                typeDesc = "合作计时和非计时";
                break;

            default:
                break;
        }
        return typeDesc;
    }
}
