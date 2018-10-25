package com.klxc.dao;

import com.klxc.pojo.InviteCode;

import java.util.List;

public interface InviteMapper {

    int getInviteCount();

    List<InviteCode> getInviteList(int start, int size);

    int getCityInviteCount(int userId);

    List<InviteCode> getCityInviteList(int start, int size, int userId);

    int getInviteCountById(int userId);

    List<InviteCode> getInviteListById(int start, int size, int userId);

    void addInvite(InviteCode invite) throws Exception;

    void uptInvite(int id, String code) throws Exception;

    void delInvite(int id) throws Exception;

}
