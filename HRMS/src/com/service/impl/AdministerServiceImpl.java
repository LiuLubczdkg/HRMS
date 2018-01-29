package com.service.impl;

import com.dao.AdministerMpper;
import com.model.Administer;
import com.service.AdministerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("administerService")
public class AdministerServiceImpl implements AdministerService {

    @Resource
    private AdministerMpper administerMpper;

    public AdministerServiceImpl() {
    }

    @Override
    public Administer selectAdmin(Administer administer) {
        return administerMpper.selectAdmin(administer);
    }

    @Override
    public boolean addAdmin(Administer administer) {
        return administerMpper.addAdmin(administer);
    }
}
