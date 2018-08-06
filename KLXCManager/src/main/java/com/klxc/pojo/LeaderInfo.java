package com.klxc.pojo;

import lombok.Data;

@Data
public class LeaderInfo {
    private int id;
    private int user_id;
    private int create_id;

    private String city;
    private String area;
    private String user_name;
    private String user_phone;
    private String create_time;
    private String update_time;
}
