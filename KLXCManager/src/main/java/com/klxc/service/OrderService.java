package com.klxc.service;

import com.klxc.pojo.Order;

import java.util.List;

public interface OrderService {

	public int getOrderCount();

	public List<Order> getOrderList(int page, int pageSize);
	
	public String getCityById(int userId);
	
	public int getCityOrderCount(String city);
	
	public List<Order> getCityOrderList(String city, int page, int pageSize);

	public int getCountById(int userId);

	public List<Order> getOrderListById(int userId, int page, int pageSize);
}
