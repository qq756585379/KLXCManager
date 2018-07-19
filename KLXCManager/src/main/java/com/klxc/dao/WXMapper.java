package com.klxc.dao;

import com.klxc.pojo.WxJoinInfo;
import com.klxc.pojo.WxSignInfo;

import java.util.List;

public interface WXMapper {

    public int getWxSignCount();

    public List<WxSignInfo> getWxSignList(int start, int size);

    public void setWxSignState(int id) throws Exception;

    public int getWxJoinCount();

    public List<WxJoinInfo> getWxJoinList(int start, int size);

    public void setWxJoinState(int id) throws Exception;

}
