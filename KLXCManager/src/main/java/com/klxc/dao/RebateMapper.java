package com.klxc.dao;

import com.klxc.pojo.CityRebate;

import java.util.List;

public interface RebateMapper {

    int getCount();

    List<CityRebate> getCityRebateList(int start, int size);

    void addCityRebate(CityRebate cityRebate);

    void delRebate(int tid);
}
