package com.klxc.service;

import com.klxc.pojo.WxJoinInfo;
import com.klxc.pojo.WxSignInfo;

import java.util.List;

public interface WXService {

    int getWxSignCount();

    List<WxSignInfo> getWxSignList(int page, int pageSize);

    boolean setWxSignState(int id);

    int getWxJoinCount();

    List<WxJoinInfo> getWxJoinList(int page, int pageSize);

    boolean setWxJoinState(int id);

}
