package com.klxc.service;

import com.klxc.pojo.BannerInfo;

import java.util.List;

public interface BannerService {

    List<BannerInfo> getBannerList();

    void addBanner(BannerInfo banner);

    boolean uptBanner(BannerInfo banner);

    void delBanner(int tid);
}
