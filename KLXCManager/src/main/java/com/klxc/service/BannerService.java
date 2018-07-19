package com.klxc.service;

import com.klxc.pojo.BannerInfo;

import java.util.List;

public interface BannerService {
    List<BannerInfo> getBannerList();

    boolean addBanner(BannerInfo banner);

    boolean uptBanner(BannerInfo banner);

    boolean delBanner(int tid);
}
