package com.klxc.dao;

import com.klxc.pojo.PayForInfo;

import java.util.List;

public interface PayForMapper {

     List<PayForInfo> getPayForList();

     void uptPayFor() throws Exception;

}
