package com.klxc.service;

import com.klxc.pojo.Permission;

import java.util.List;

public interface PermService {
	public List<Permission> getPermList();

	public boolean uptPerm(Permission perm);
	
	public boolean addPerm(Permission perm);
	
	public boolean delPerm(int tid);
}
