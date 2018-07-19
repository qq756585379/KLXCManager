package com.klxc.pojo;

public class PlaceClass {
    private int rid;
    private int id; // 班级ID
    private String name; // 班级名称
    private float price; // 班级价格
    private float price_open; // 开班费
    private float price_hour; // 每课时单价
    private int total_hour; // 总共课时
    private float min_hour; // 最小要买入的课时
    private String save_money;// 省钱
    private String save_time;// 省时
    private String lesson;// 课程类型
    private int class_type; // 班级类型；1：自营计时；2：自营非计时；11：合作计时；12：合作非计时；
    private String class_type_desc;
    private int max_sign_num;//最大报名人数；默认100000
    private String city; // 所在城市
    private String service_content; // 特色服务
    private String bus_plan;// 接送方案
    private String price_remark;// 费用说明

    private int place_id;
    private String place_name;

    private String create_time; // 创建时间

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice_open() {
        return price_open;
    }

    public void setPrice_open(float price_open) {
        this.price_open = price_open;
    }

    public float getPrice_hour() {
        return price_hour;
    }

    public void setPrice_hour(float price_hour) {
        this.price_hour = price_hour;
    }

    public int getTotal_hour() {
        return total_hour;
    }

    public void setTotal_hour(int total_hour) {
        this.total_hour = total_hour;
    }

    public float getMin_hour() {
        return min_hour;
    }

    public void setMin_hour(float min_hour) {
        this.min_hour = min_hour;
    }

    public String getSave_money() {
        return save_money;
    }

    public void setSave_money(String save_money) {
        this.save_money = save_money;
    }

    public String getSave_time() {
        return save_time;
    }

    public void setSave_time(String save_time) {
        this.save_time = save_time;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public int getClass_type() {
        return class_type;
    }

    public void setClass_type(int class_type) {
        this.class_type = class_type;
    }

    public String getClass_type_desc() {
        class_type_desc = ClassData.getTypeDesc(class_type);
        return class_type_desc;
    }

    public void setClass_type_desc(String class_type_desc) {
        this.class_type_desc = class_type_desc;
    }

    public int getMax_sign_num() {
        return max_sign_num;
    }

    public void setMax_sign_num(int max_sign_num) {
        this.max_sign_num = max_sign_num;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getService_content() {
        return service_content;
    }

    public void setService_content(String service_content) {
        this.service_content = service_content;
    }

    public String getBus_plan() {
        return bus_plan;
    }

    public void setBus_plan(String bus_plan) {
        this.bus_plan = bus_plan;
    }

    public String getPrice_remark() {
        return price_remark;
    }

    public void setPrice_remark(String price_remark) {
        this.price_remark = price_remark;
    }

    public int getPlace_id() {
        return place_id;
    }

    public void setPlace_id(int place_id) {
        this.place_id = place_id;
    }

    public String getPlace_name() {
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
