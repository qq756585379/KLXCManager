package com.klxc.dao;

import com.klxc.pojo.InsuranceInfo;

import java.util.List;

public interface InsuranceMapper {

    List<InsuranceInfo> getInsuranceList();

    void uptInsurance() throws Exception;

}
