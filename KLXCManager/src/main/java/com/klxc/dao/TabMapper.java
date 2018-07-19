package com.klxc.dao;

import com.klxc.pojo.FunBean;
import com.klxc.pojo.TabBean;

import java.util.List;

public interface TabMapper {

    public List<TabBean> getTabList();

    public List<FunBean> getFunList();

}