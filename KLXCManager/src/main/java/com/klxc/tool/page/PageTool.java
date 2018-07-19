package com.klxc.tool.page;

import com.klxc.common.Const;

import javax.servlet.http.HttpServletRequest;

public class PageTool {

    public static void setPage(HttpServletRequest request, int totalSize, int curPage, int pageSize, String url) {
        int totalPage = 0;
        if (pageSize != 0) {
            totalPage = totalSize / pageSize;
        }
        set(request, totalPage, curPage, url);
    }

    public static void setPage10(HttpServletRequest request, int totalSize, int curPage, String url) {
        double total = (double) totalSize / Const.pageSize10;
        int totalPage = (int) Math.ceil(total);
        set(request, totalPage, curPage, url);
    }

    public static void setPage20(HttpServletRequest request, int totalSize, int curPage, String url) {
        double total = (double) totalSize / Const.pageSize20;
        int totalPage = (int) Math.ceil(total);
        set(request, totalPage, curPage, url);
    }

    public static void setPage100(HttpServletRequest request, int totalSize, int curPage, String url) {
        double total = (double) totalSize / Const.pageSize100;
        int totalPage = (int) Math.ceil(total);
        set(request, totalPage, curPage, url);
    }

    private static void set(HttpServletRequest request, int totalPage, int curPage, String url) {
        if (totalPage < 1) {
            totalPage = 1;
        }
        if (curPage < 1) {
            curPage = 1;
        }
        if (curPage > totalPage) {
            curPage = totalPage;
        }
        request.setAttribute("totalPage", totalPage);
        request.setAttribute("curPage", curPage);
        request.setAttribute("url", url);
    }
}
