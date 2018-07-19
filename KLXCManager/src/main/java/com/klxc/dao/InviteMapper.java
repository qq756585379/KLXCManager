package com.klxc.dao;

import com.klxc.pojo.InviteCode;

import java.util.List;

public interface InviteMapper {

    public int getInviteCount();

    public List<InviteCode> getInviteList(int start, int size);

    public int getCityInviteCount(int userId);

    public List<InviteCode> getCityInviteList(int start, int size, int userId);

    public int getInviteCountById(int userId);

    public List<InviteCode> getInviteListById(int start, int size, int userId);

    public void addInvite(InviteCode invite) throws Exception;

    public void uptInvite(int id, String code) throws Exception;

    public void delInvite(int id) throws Exception;

}
