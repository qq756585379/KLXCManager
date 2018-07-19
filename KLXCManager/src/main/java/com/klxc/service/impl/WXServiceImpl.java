package com.klxc.service.impl;

import com.klxc.dao.WXMapper;
import com.klxc.pojo.WxJoinInfo;
import com.klxc.pojo.WxSignInfo;
import com.klxc.service.WXService;
import com.klxc.tool.page.PageBean;
import com.klxc.tool.page.Pager;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.annotation.Resource;

@Service
public class WXServiceImpl implements WXService {

    @Resource
    private WXMapper wXMapper;

    @Override
    public int getWxSignCount() {
        return wXMapper.getWxSignCount();
    }

    @Override
    public List<WxSignInfo> getWxSignList(int page, int pageSize) {
        PageBean bean = Pager.getPage(page, pageSize);
        return wXMapper.getWxSignList(bean.getStart(), bean.getSize());
    }

    @Override
    public int getWxJoinCount() {
        return wXMapper.getWxJoinCount();
    }

    @Override
    public List<WxJoinInfo> getWxJoinList(int page, int pageSize) {
        PageBean bean = Pager.getPage(page, pageSize);
        return wXMapper.getWxJoinList(bean.getStart(), bean.getSize());
    }

    @Override
    public boolean setWxSignState(int id) {
        try {
            wXMapper.setWxJoinState(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean setWxJoinState(int id) {
        try {
            wXMapper.setWxSignState(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
