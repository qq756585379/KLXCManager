package com.klxc.dao;

import com.klxc.pojo.Permission;

import java.util.List;

public interface PermMapper {

    public List<Permission> getPermList();

    public void uptPerm(Permission perm);

    public void addPerm(Permission perm) throws Exception;

    public void delPerm(int tid) throws Exception;

}
