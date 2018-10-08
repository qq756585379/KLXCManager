package com.klxc.service.impl;

import com.klxc.dao.BannerMapper;
import com.klxc.pojo.BannerInfo;
import com.klxc.service.BannerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {

    @Resource
    private BannerMapper bannerMapper;

    @Override
    public List<BannerInfo> getBannerList() {
        return bannerMapper.getBannerList();
    }

    @Override
    public void addBanner(BannerInfo banner) {
        if (banner == null) return;
        try {
            bannerMapper.addBanner(banner);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean uptBanner(BannerInfo banner) {
        if (banner == null) {
            return false;
        }
        try {
            bannerMapper.uptBanner(banner);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void delBanner(int tid) {
        try {
            bannerMapper.delBanner(tid);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
