package com.klxc.pojo;

import com.klxc.tool.UtilTool;

public class SchoolData {

    //班级类型；1：自营计时；2：自营非计时；3:自营计时和非计时；11：合作计时；12：合作非计时；13：合作计时和非计时
    private final static String type1 = "1";
    private final static String type2 = "2";
    private final static String type11 = "11";
    private final static String type12 = "12";

    public static int getClassType(String class_type, int type) {
        if (UtilTool.isNull(class_type)) {
            return 0;
        }
        if (type == 0) {
            if (class_type.contains(type1) && class_type.contains(type2)) {
                return 3;
            } else if (class_type.contains(type1)) {
                return 1;
            } else if (class_type.contains(type2)) {
                return 2;
            }
        } else {
            if (class_type.contains(type11) && class_type.contains(type12)) {
                return 13;
            } else if (class_type.contains(type11)) {
                return 11;
            } else if (class_type.contains(type12)) {
                return 12;
            }
        }
        return 0;
    }

}
