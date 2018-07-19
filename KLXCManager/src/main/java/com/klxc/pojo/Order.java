package com.klxc.pojo;

/**
 * 订单
 * 
 * @author qiujing
 *
 */
public class Order {
	private int tid;
	private int coach_tid;// 教练tid
	private int user_tid;// 用户（学员）tid
	private float order_money;// 订单金额
	private int pay_done;// 支付是否成功，0：未支付。1：成功
	private String pay_done_desc;

	private String order_remark;// 订单留言
	private String order_phone;// 订单联系电话
	private String class_content;
	private float order_original_price;// 订单原价
	private String order_name;// 订单联系人
	private String invitation_code;// 邀请码
	private String create_time;// 订单产生时间

	private String user_nicname;
	private String telephone;
	private String place_name;
	private String city;
	private String area;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getCoach_tid() {
		return coach_tid;
	}

	public void setCoach_tid(int coach_tid) {
		this.coach_tid = coach_tid;
	}

	public int getUser_tid() {
		return user_tid;
	}

	public void setUser_tid(int user_tid) {
		this.user_tid = user_tid;
	}

	public float getOrder_money() {
		return order_money;
	}

	public void setOrder_money(float order_money) {
		this.order_money = order_money;
	}

	public int getPay_done() {
		return pay_done;
	}

	public void setPay_done(int pay_done) {
		this.pay_done = pay_done;
	}

	public String getPay_done_desc() {
		if (pay_done == 1) {
			pay_done_desc = "成功";
		} else {
			pay_done_desc = "未支付";
		}
		return pay_done_desc;
	}

	public String getOrder_remark() {
		return order_remark;
	}

	public void setOrder_remark(String order_remark) {
		this.order_remark = order_remark;
	}

	public String getOrder_phone() {
		return order_phone;
	}

	public void setOrder_phone(String order_phone) {
		this.order_phone = order_phone;
	}

	public String getClass_content() {
		return class_content;
	}

	public void setClass_content(String class_content) {
		this.class_content = class_content;
	}

	public float getOrder_original_price() {
		return order_original_price;
	}

	public void setOrder_original_price(float order_original_price) {
		this.order_original_price = order_original_price;
	}

	public String getOrder_name() {
		return order_name;
	}

	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}

	public String getInvitation_code() {
		return invitation_code;
	}

	public void setInvitation_code(String invitation_code) {
		this.invitation_code = invitation_code;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

	public String getUser_nicname() {
		return user_nicname;
	}

	public void setUser_nicname(String user_nicname) {
		this.user_nicname = user_nicname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPlace_name() {
		return place_name;
	}

	public void setPlace_name(String place_name) {
		this.place_name = place_name;
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

	public void setPay_done_desc(String pay_done_desc) {
		this.pay_done_desc = pay_done_desc;
	}

}
