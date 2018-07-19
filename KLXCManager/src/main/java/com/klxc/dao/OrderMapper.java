package com.klxc.dao;

import com.klxc.pojo.Order;

import java.util.List;

public interface OrderMapper {

    public int getCount();

    public List<Order> getOrderList(int start, int size);

    public int getCityOrderCount(String city);

    public List<Order> getCityOrderList(String city, int start, int size);

    public int getCountById(int userId);

    public List<Order> getOrderListById(int userId, int start, int size);

}
