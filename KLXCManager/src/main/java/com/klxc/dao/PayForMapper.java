package com.klxc.dao;

import com.klxc.pojo.PayForInfo;

import java.util.List;

public interface PayForMapper {

    public List<PayForInfo> getPayForList();

    public void uptPayFor() throws Exception;

}
