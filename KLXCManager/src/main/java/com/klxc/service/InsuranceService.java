package com.klxc.service;

import com.klxc.pojo.InsuranceInfo;
import com.klxc.pojo.PayForInfo;

import java.util.List;

public interface InsuranceService {
    public List<InsuranceInfo> getInsuranceList();

    public List<PayForInfo> getPayForList();
}
