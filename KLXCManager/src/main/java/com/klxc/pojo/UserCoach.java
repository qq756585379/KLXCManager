package com.klxc.pojo;

public class UserCoach {
    private int user_id;
    private String user_name;// '用户名'
    private String user_password;
    private String user_nicname;
    private int user_sex; // '用户性别'
    private int user_age; // '用户年龄'
    private String user_address; // '用户详细地址'
    private String telephone; // '用户手机号'
    private int user_type;// 0:无效用户；1:教练；2：后台管理人员
    private int coach_id;// 教练ID
    private int source_id;// 后台管理账户ID
    private String user_ID_card; // '身份证号码'
    private String user_image; // '用户头像url'
    private String user_city; // '城市'
    private String user_area; // '城市'
    private String token; // '用户登录token'
    private String open_id;
    private int user_wallet_tid;
    private String invitation_code; // '邀请码'
    private double balance; // '钱包金额'

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_nicname() {
        return user_nicname;
    }

    public void setUser_nicname(String user_nicname) {
        this.user_nicname = user_nicname;
    }

    public int getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(int user_sex) {
        this.user_sex = user_sex;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }

    public int getCoach_id() {
        return coach_id;
    }

    public void setCoach_id(int coach_id) {
        this.coach_id = coach_id;
    }

    public int getSource_id() {
        return source_id;
    }

    public void setSource_id(int source_id) {
        this.source_id = source_id;
    }

    public String getUser_ID_card() {
        return user_ID_card;
    }

    public void setUser_ID_card(String user_ID_card) {
        this.user_ID_card = user_ID_card;
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

    public String getUser_city() {
        return user_city;
    }

    public void setUser_city(String user_city) {
        this.user_city = user_city;
    }

    public String getUser_area() {
        return user_area;
    }

    public void setUser_area(String user_area) {
        this.user_area = user_area;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public int getUser_wallet_tid() {
        return user_wallet_tid;
    }

    public void setUser_wallet_tid(int user_wallet_tid) {
        this.user_wallet_tid = user_wallet_tid;
    }

    public String getInvitation_code() {
        return invitation_code;
    }

    public void setInvitation_code(String invitation_code) {
        this.invitation_code = invitation_code;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
