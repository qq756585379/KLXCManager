package com.klxc.pojo;

import java.util.List;

public class TabData {
    private String id;
    private String lid;
    private String name;
    private String url;
    private List<TabData> tabList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<TabData> getTabList() {
        return tabList;
    }

    public void setTabList(List<TabData> tabList) {
        this.tabList = tabList;
    }
}
