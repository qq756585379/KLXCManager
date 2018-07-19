package com.klxc.pojo;

public class Coach {
    private int id;
    private String coach_name;
    private int coach_sex;// 0：男；1：女
    private String coach_sex_desc;
    private int coach_school_age;// 教龄
    private int coach_driving_years;// 驾龄
    private int place_id; // 所属驾校
    private String place_name; // 所属驾校
    private int class_id;
    private String class_name; // 所属驾校
    private String coach_lesson;// 教练所教授课程，默认为c1拍照
    private String coach_favicon_url;// 头像图片url
    private String coach_city;// 教练所在城市
    private String coach_area;// 区
    private String coach_telephone; // 手机号码
    private String car_no;//车牌
    private String car_type;//车品牌
    private int sign_num;//培训人数
    private int pass_rate_two;//科目二通过率
    private int pass_rate_three;//科目三通过率
    private String create_time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCoach_name() {
        return coach_name;
    }

    public void setCoach_name(String coach_name) {
        this.coach_name = coach_name;
    }

    public int getCoach_sex() {
        return coach_sex;
    }

    public void setCoach_sex(int coach_sex) {
        this.coach_sex = coach_sex;
    }

    public String getCoach_sex_desc() {
        switch (coach_sex) {
            case 0:
                coach_sex_desc = "男";
                break;
            case 1:
                coach_sex_desc = "女";
                break;
            default:
                break;
        }
        return coach_sex_desc;
    }

    public void setCoach_sex_desc(String coach_sex_desc) {
        this.coach_sex_desc = coach_sex_desc;
    }

    public int getCoach_school_age() {
        return coach_school_age;
    }

    public void setCoach_school_age(int coach_school_age) {
        this.coach_school_age = coach_school_age;
    }

    public int getCoach_driving_years() {
        return coach_driving_years;
    }

    public void setCoach_driving_years(int coach_driving_years) {
        this.coach_driving_years = coach_driving_years;
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

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getCoach_lesson() {
        return coach_lesson;
    }

    public void setCoach_lesson(String coach_lesson) {
        this.coach_lesson = coach_lesson;
    }

    public String getCoach_favicon_url() {
        return coach_favicon_url;
    }

    public void setCoach_favicon_url(String coach_favicon_url) {
        this.coach_favicon_url = coach_favicon_url;
    }

    public String getCoach_city() {
        return coach_city;
    }

    public void setCoach_city(String coach_city) {
        this.coach_city = coach_city;
    }

    public String getCoach_area() {
        return coach_area;
    }

    public void setCoach_area(String coach_area) {
        this.coach_area = coach_area;
    }

    public String getCoach_telephone() {
        return coach_telephone;
    }

    public void setCoach_telephone(String coach_telephone) {
        this.coach_telephone = coach_telephone;
    }

    public String getCar_no() {
        return car_no;
    }

    public void setCar_no(String car_no) {
        this.car_no = car_no;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public int getSign_num() {
        return sign_num;
    }

    public void setSign_num(int sign_num) {
        this.sign_num = sign_num;
    }

    public int getPass_rate_two() {
        return pass_rate_two;
    }

    public void setPass_rate_two(int pass_rate_two) {
        this.pass_rate_two = pass_rate_two;
    }

    public int getPass_rate_three() {
        return pass_rate_three;
    }

    public void setPass_rate_three(int pass_rate_three) {
        this.pass_rate_three = pass_rate_three;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

}
