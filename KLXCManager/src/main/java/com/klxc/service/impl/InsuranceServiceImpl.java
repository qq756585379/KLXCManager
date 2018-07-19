package com.klxc.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import com.klxc.dao.InsuranceMapper;
import com.klxc.dao.PayForMapper;
import com.klxc.pojo.InsuranceInfo;
import com.klxc.pojo.PayForInfo;
import com.klxc.service.InsuranceService;
import com.klxc.tool.UtilTool;
import org.springframework.stereotype.Service;

@Service
public class InsuranceServiceImpl implements InsuranceService {

    @Resource
    private InsuranceMapper insuranceMapper;

    @Resource
    private PayForMapper payForMapper;

    @Override
    public List<InsuranceInfo> getInsuranceList() {
        List<InsuranceInfo> list = insuranceMapper.getInsuranceList();
        if (UtilTool.isExtNull(list)) {
            return list;
        }
        try {
            insuranceMapper.uptInsurance();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    @Override
    public List<PayForInfo> getPayForList() {
        List<PayForInfo> list = payForMapper.getPayForList();
        if (UtilTool.isExtNull(list)) {
            return list;
        }
        try {
            payForMapper.uptPayFor();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

}
