package com.klxc.dao;

import com.klxc.pojo.InsuranceInfo;

import java.util.List;

public interface InsuranceMapper {

    public List<InsuranceInfo> getInsuranceList();

    public void uptInsurance() throws Exception;

}
