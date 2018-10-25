package com.klxc.dao;

import com.klxc.pojo.Permission;

import java.util.List;

public interface PermissionMapper {

     List<Permission> getPermList();

     void uptPerm(Permission perm);

     void addPerm(Permission perm) throws Exception;

     void delPerm(int tid) throws Exception;
}
