package com.klxc.dao;

import com.klxc.pojo.Pay;

import java.util.List;

public interface PayMapper {

    public int getCount();

    public List<Pay> getPayList(int start, int size);

    public int getCountById(int userId);

    public List<Pay> getPayListById(int userId, int start, int size);

}
