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
    public boolean addBanner(BannerInfo banner) {
        if (banner == null) {
            return false;
        }
        try {
            bannerMapper.addBanner(banner);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
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
    public boolean delBanner(int tid) {
        try {
            bannerMapper.delBanner(tid);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
