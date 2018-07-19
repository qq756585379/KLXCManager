package com.klxc.dao;

import com.klxc.pojo.BannerInfo;

import java.util.List;

public interface BannerMapper {

    List<BannerInfo> getBannerList();

    void addBanner(BannerInfo banner);

    void uptBanner(BannerInfo banner);

    void delBanner(int tid);
}
