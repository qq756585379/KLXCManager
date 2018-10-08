package com.klxc.service;

import com.klxc.pojo.CityRebate;

import java.util.List;

public interface RebateService {

    int getCount();

    List<CityRebate> getCityRebateList(int page, int pageSize);

    boolean addCityRebate(CityRebate cityRebate);

    boolean delRebate(int tid);
}
