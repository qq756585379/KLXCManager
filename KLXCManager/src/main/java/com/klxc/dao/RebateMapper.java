package com.klxc.dao;

import com.klxc.pojo.CityRebate;

import java.util.List;

public interface RebateMapper {
	
	public int getCount();
	
	public List<CityRebate> getCityRebateList(int start, int size);
	
	public void addCityRebate(CityRebate cityRebate);
	
	public void delRebate(int tid);
	
	
}
