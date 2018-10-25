package com.klxc.dao;

import com.klxc.pojo.Pay;

import java.util.List;

public interface PayMapper {

     int getCount();

     List<Pay> getPayList(int start, int size);

     int getCountById(int userId);

     List<Pay> getPayListById(int userId, int start, int size);

}
