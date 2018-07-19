package com.klxc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.klxc.dao.CityLMapper;
import com.klxc.dao.OrderMapper;
import com.klxc.pojo.LeaderInfo;
import com.klxc.pojo.Order;
import com.klxc.service.OrderService;
import com.klxc.tool.UtilTool;
import com.klxc.tool.page.PageBean;
import com.klxc.tool.page.Pager;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Resource
    private CityLMapper cityLMapper;

    @Override
    public int getOrderCount() {
        return orderMapper.getCount();
    }

    @Override
    public List<Order> getOrderList(int page, int pageSize) {
        PageBean bean = Pager.getPage(page, pageSize);
        return orderMapper.getOrderList(bean.getStart(), bean.getSize());
    }

    @Override
    public int getCountById(int userId) {
        return orderMapper.getCountById(userId);
    }

    @Override
    public List<Order> getOrderListById(int userId, int page, int pageSize) {
        PageBean bean = Pager.getPage(page, pageSize);
        return orderMapper.getOrderListById(userId, bean.getStart(), bean.getSize());
    }

    @Override
    public String getCityById(int userId) {
        String city = "";
        List<LeaderInfo> list = cityLMapper.getLeaderListById(userId);
        if (!UtilTool.isExtNull(list)) {
            city = list.get(0).getCity();
        }
        return city;
    }

    @Override
    public int getCityOrderCount(String city) {
        return orderMapper.getCityOrderCount(city);
    }

    @Override
    public List<Order> getCityOrderList(String city, int page, int pageSize) {
        PageBean bean = Pager.getPage(page, pageSize);
        return orderMapper.getCityOrderList(city, bean.getStart(), bean.getSize());
    }
}
