package com.klxc.service;

import com.klxc.pojo.WxJoinInfo;
import com.klxc.pojo.WxSignInfo;

import java.util.List;

public interface WXService {

    public int getWxSignCount();

    public List<WxSignInfo> getWxSignList(int page, int pageSize);

    public boolean setWxSignState(int id);

    public int getWxJoinCount();

    public List<WxJoinInfo> getWxJoinList(int page, int pageSize);

    public boolean setWxJoinState(int id);

}
