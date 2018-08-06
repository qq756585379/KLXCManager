package com.klxc.dao;

import com.klxc.pojo.FunBean;
import com.klxc.pojo.TabBean;

import java.util.List;

public interface TabMapper {

    List<TabBean> getTabList();

    List<FunBean> getFunList();

}