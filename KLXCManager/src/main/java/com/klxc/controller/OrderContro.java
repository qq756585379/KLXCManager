package com.klxc.controller;

import javax.servlet.http.HttpServletRequest;

import com.klxc.common.Const;
import com.klxc.pojo.Order;
import com.klxc.service.OrderService;
import com.klxc.tool.UtilTool;
import com.klxc.tool.page.PageTool;
import com.klxc.vo.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderContro {

    @Autowired
    private OrderService orderService;

    private int pageSize = 20;

    @RequestMapping("/getOrderList")
    public String getOrderList(HttpServletRequest request) {
        String pageStr = (String) request.getParameter("page");
        int curPage = UtilTool.toInteger(pageStr);
        int totalSize = orderService.getOrderCount();
        List<Order> list = orderService.getOrderList(curPage, pageSize);

        request.setAttribute("list", list);
        PageTool.setPage20(request, totalSize, curPage, "order/getOrderList");
        return "orderlist";
    }

    @RequestMapping("/getCityOrderList")
    public String getCityOrderList(HttpServletRequest request) {
        String pageStr = (String) request.getParameter("page");
        int curPage = UtilTool.toInteger(pageStr);
        int userId = UserData.getUser(request).getId();
        String city = orderService.getCityById(userId);
        if (UtilTool.isNull(city)) {
            return "orderlist";
        }
        int totalSize = orderService.getCityOrderCount(city);
        List<Order> list = orderService.getCityOrderList(city, curPage, pageSize);

        request.setAttribute("list", list);
        PageTool.setPage20(request, totalSize, curPage, "order/getCityOrderList");
        return "orderlist";
    }

    @RequestMapping("/getUserOrderList")
    public String getUserOrderList(HttpServletRequest request) {
        String pageStr = (String) request.getParameter("page");
        int curPage = UtilTool.toInteger(pageStr);
        int userId = UserData.getUser(request).getId();
        int totalSize = orderService.getCountById(userId);
        List<Order> list = orderService.getOrderListById(userId, curPage, pageSize);

        request.setAttribute("list", list);
        PageTool.setPage20(request, totalSize, curPage, "order/getUserOrderList");
        return "orderlist";
    }
}
