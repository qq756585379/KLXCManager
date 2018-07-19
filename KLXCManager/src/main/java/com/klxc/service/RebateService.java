package com.klxc.service;

import com.klxc.pojo.CityRebate;

import java.util.List;

public interface RebateService {
	
	public int getCount();
	
	public List<CityRebate> getCityRebateList(int page, int pageSize);
	
	public boolean addCityRebate(CityRebate cityRebate);
	
	public boolean delRebate(int tid);
}
