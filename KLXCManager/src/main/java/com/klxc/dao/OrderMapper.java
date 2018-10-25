package com.klxc.dao;

import com.klxc.pojo.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

     int getCount();

    List<Order> getOrderList(@Param("start") int start, @Param("size") int size);

     int getCityOrderCount(String city);

    List<Order> getCityOrderList(@Param("city") String city, @Param("start") int start, @Param("size") int size);

    int getCountById(int userId);

    List<Order> getOrderListById(@Param("userId") int userId, @Param("start") int start, @Param("size") int size);

}
