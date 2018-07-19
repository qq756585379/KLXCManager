package com.klxc.pojo;

public class StudentInfo {
    private int tid;// 学员ID
    private int stu_id;// 学员用户ID
    private int stu_schedule = 0;// 学员状态，0：体检；1：科目1；2：科目2；3：科目3；4：科目4；5：毕业；
    private int state;

    private String stu_name;// 学员用户名字
    private String stu_phone;// 学员用户电话
    private float class_money;
    private int class_type;// 班级类型
    private String class_type_desc;

    private int place_id;
    private String place_name;
    private int coach_id;
    private String hasCoach;

    private int order_id;

    private String create_time;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public int getStu_schedule() {
        return stu_schedule;
    }

    public void setStu_schedule(int stu_schedule) {
        this.stu_schedule = stu_schedule;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_phone() {
        return stu_phone;
    }

    public void setStu_phone(String stu_phone) {
        this.stu_phone = stu_phone;
    }

    public float getClass_money() {
        return class_money;
    }

    public void setClass_money(float class_money) {
        this.class_money = class_money;
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

    public int getCoach_id() {
        return coach_id;
    }

    public void setCoach_id(int coach_id) {
        this.coach_id = coach_id;
    }

    public String getHasCoach() {
        if (coach_id > 0) {
            hasCoach = "是";
        } else {
            hasCoach = "否";
        }
        return hasCoach;
    }

    public void setHasCoach(String hasCoach) {
        this.hasCoach = hasCoach;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

}
