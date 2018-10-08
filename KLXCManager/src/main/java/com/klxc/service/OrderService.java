package com.klxc.service;

import com.klxc.pojo.Order;

import java.util.List;

public interface OrderService {

    int getOrderCount();

    List<Order> getOrderList(int page, int pageSize);

    String getCityById(int userId);

    int getCityOrderCount(String city);

    List<Order> getCityOrderList(String city, int page, int pageSize);

    int getCountById(int userId);

    List<Order> getOrderListById(int userId, int page, int pageSize);
}
