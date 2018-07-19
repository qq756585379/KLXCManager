package com.klxc.pojo;

public class PlaceInfo {
	private int id; // 场地ID
	private String name; // 场地名称
	private String service_content; // 服务内容
	private String img_url1;
	private String img_url2;
	private String img_url3;
	private String city; // 所在城市
	private String area;
	private String address; // 练车地址
	private String location; // 经纬度坐标
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

	public String getService_content() {
		return service_content;
	}

	public void setService_content(String service_content) {
		this.service_content = service_content;
	}

	public String getImg_url1() {
		return img_url1;
	}

	public void setImg_url1(String img_url1) {
		this.img_url1 = img_url1;
	}

	public String getImg_url2() {
		return img_url2;
	}

	public void setImg_url2(String img_url2) {
		this.img_url2 = img_url2;
	}

	public String getImg_url3() {
		return img_url3;
	}

	public void setImg_url3(String img_url3) {
		this.img_url3 = img_url3;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCreate_time() {
		return create_time;
	}

	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

}
