package com.klxc.pojo;

import com.klxc.tool.UtilTool;

public class SchoolInfo {

    private int id; // 驾校ID
    private String name; // 驾校名称
    private int type; // 驾校类型；0：自营；1：合作
    private String typeDesc;
    private String class_type;// 班级类型；1：自营计时；2：自营非计时；3:自营计时和非计时；11：合作计时；12：合作非计时；13：合作计时和非计时
    private int classType;
    private String city; // 所在城市
    private String area;
    private String address; // 驾校地址

    private String place_id;
    private String place_name;

    private String create_time; // 创建时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTypeDesc() {
        switch (type) {
            case 0:
                typeDesc = "自营";
                break;
            case 1:
                typeDesc = "合作";
                break;
            default:
                break;
        }
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public String getClass_type() {
        return class_type;
    }

    public void setClass_type(String class_type) {
        this.class_type = class_type;
    }

    public int getClassType() {
        return classType;
    }

    public void setClassType(int classType) {
        this.classType = classType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPlace_id() {
        return place_id;
    }

    public void setPlace_id(String place_id) {
        this.place_id = place_id;
    }

    public String getPlace_name() {
        if (UtilTool.isNull(place_name)) {
            return "未绑定";
        }
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

}
