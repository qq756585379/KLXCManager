package com.klxc.service;

import com.klxc.pojo.Permission;

import java.util.List;

public interface PermService {

    List<Permission> getPermList();

    boolean uptPerm(Permission perm);

    boolean addPerm(Permission perm);

    boolean delPerm(int tid);
}
