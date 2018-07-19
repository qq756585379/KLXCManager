package com.klxc.tool.page;

public class Pager {

    public static PageBean getPage(int page, int pageSize) {
        PageBean bean = new PageBean();
        page = getPage(page);
        pageSize = getPageSize(pageSize);
        int start = (page - 1) * pageSize;
        if (start < 0) {
            start = 0;
        }
        bean.setStart(start);
        bean.setSize(pageSize);
        return bean;
    }

    private static int getPage(int page) {
        if (page <= 0) {
            return 1;
        }
        return page;
    }

    private static int getPageSize(int pageSize) {
        if (pageSize <= 0) {
            return 10;
        } else if (pageSize > 50) {
            return 50;
        }
        return pageSize;
    }
}
