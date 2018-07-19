package com.klxc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.klxc.dao.PermMapper;
import com.klxc.pojo.Permission;
import com.klxc.service.PermService;
import org.springframework.stereotype.Service;

@Service
public class PermServiceImpl implements PermService {

    @Resource
    private PermMapper permMapper;

    @Override
    public List<Permission> getPermList() {
        return permMapper.getPermList();
    }

    @Override
    public boolean uptPerm(Permission perm) {
        if (perm == null) {
            return false;
        }
        try {
            permMapper.uptPerm(perm);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean addPerm(Permission perm) {
        try {
            permMapper.addPerm(perm);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delPerm(int tid) {
        try {
            permMapper.delPerm(tid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
