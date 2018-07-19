package com.klxc.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.klxc.dao.CityLMapper;
import com.klxc.pojo.LeaderInfo;
import com.klxc.service.CityLService;
import com.klxc.tool.page.PageBean;
import com.klxc.tool.page.Pager;
import com.klxc.util.TimeTool;
import org.springframework.stereotype.Service;

@Service
public class CityLServiceImpl implements CityLService {

	@Resource
	private CityLMapper cityLMapper;
	
	@Override
	public int getLeaderCount() {
		return cityLMapper.getLeaderCount();
	}

	@Override
	public List<LeaderInfo> getLeaderList(int page, int pageSize) {
		PageBean bean = Pager.getPage(page, pageSize);
		return cityLMapper.getLeaderList(bean.getStart(), bean.getSize());
	}

	@Override
	public boolean addLeader(LeaderInfo leader) {
		if(leader == null) {
			return false;
		}
		try {
			leader.setCreate_time(TimeTool.formatDateTime(new Date()));
			cityLMapper.addLeader(leader);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delLeader(int id) {
		try {
			cityLMapper.delLeader(id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
