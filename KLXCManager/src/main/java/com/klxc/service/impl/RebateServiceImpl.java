package com.klxc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.klxc.dao.RebateMapper;
import com.klxc.pojo.CityRebate;
import com.klxc.service.RebateService;
import org.springframework.stereotype.Service;

@Service
public class RebateServiceImpl implements RebateService {

    @Resource
    private RebateMapper rebateMapper;

    @Override
    public int getCount() {
        return rebateMapper.getCount();
    }

    @Override
    public List<CityRebate> getCityRebateList(int page, int pageSize) {
        int start = (page - 1) * pageSize;
        if (start < 0) {
            start = 0;
        }
        return rebateMapper.getCityRebateList(start, pageSize);
    }

    @Override
    public boolean addCityRebate(CityRebate cityRebate) {
        if (cityRebate == null) {
            return false;
        }
        try {
            rebateMapper.addCityRebate(cityRebate);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delRebate(int tid) {
        try {
            rebateMapper.delRebate(tid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
