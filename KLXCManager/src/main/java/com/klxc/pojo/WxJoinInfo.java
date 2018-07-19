package com.klxc.pojo;

public class WxJoinInfo {

    private int id;
    private String join_name;
    private String join_type;
    private String contact_name;
    private String contact_mode;
    private String create_time;
    private String city;
    private int state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJoin_name() {
        return join_name;
    }

    public void setJoin_name(String join_name) {
        this.join_name = join_name;
    }

    public String getJoin_type() {
        return join_type;
    }

    public void setJoin_type(String join_type) {
        this.join_type = join_type;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_mode() {
        return contact_mode;
    }

    public void setContact_mode(String contact_mode) {
        this.contact_mode = contact_mode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

}
