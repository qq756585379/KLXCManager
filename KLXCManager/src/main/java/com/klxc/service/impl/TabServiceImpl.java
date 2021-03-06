package com.klxc.service.impl;

import com.klxc.dao.TabMapper;
import com.klxc.pojo.FunBean;
import com.klxc.pojo.TabBean;
import com.klxc.pojo.TabData;
import com.klxc.service.TabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TabServiceImpl implements TabService {

    @Autowired
    private TabMapper tabMapper;

    @Override
    public List<TabData> getTabList(String tabInfo) {

        List<TabData> list = new ArrayList<TabData>();
        List<TabBean> tabList = tabMapper.getTabList();
        List<FunBean> funList = tabMapper.getFunList();

        for (TabBean tabBean : tabList) {
            if ("all".equals(tabInfo) || tabInfo.contains(tabBean.getId())) {
                TabData data = new TabData();
                data.setId(tabBean.getId());
                data.setLid(tabBean.getLid());
                data.setName(tabBean.getName());
                data.setUrl(tabBean.getUrl());

                List<TabData> funInfo = new ArrayList<TabData>();
                for (FunBean fun : funList) {
                    if (tabBean.getId() == null || !tabBean.getId().equals(fun.getPid())) {
                        continue;
                    }
                    if ("all".equals(tabInfo) || tabInfo.contains(fun.getId())) {
                        TabData d = new TabData();
                        d.setId(fun.getId());
                        d.setLid(fun.getLid());
                        d.setName(fun.getName());
                        d.setUrl(fun.getUrl());
                        funInfo.add(d);
                    }
                }
                data.setTabList(funInfo);
                list.add(data);
            }
        }
        return list;
    }
}
