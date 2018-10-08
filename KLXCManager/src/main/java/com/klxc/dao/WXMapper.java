package com.klxc.dao;

import com.klxc.pojo.WxJoinInfo;
import com.klxc.pojo.WxSignInfo;

import java.util.List;

public interface WXMapper {

    int getWxSignCount();

    List<WxSignInfo> getWxSignList(int start, int size);

    void setWxSignState(int id) throws Exception;

    int getWxJoinCount();

    List<WxJoinInfo> getWxJoinList(int start, int size);

    void setWxJoinState(int id) throws Exception;

}
