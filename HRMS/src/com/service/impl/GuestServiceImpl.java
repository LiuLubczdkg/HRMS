package com.service.impl;

import com.dao.GuestMapper;
import com.model.Guest;
import com.service.GuestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("guest")
public class GuestServiceImpl implements GuestService {
    @Resource
    private GuestMapper guestMapper;

    public GuestServiceImpl() {
    }

    @Override
    public List<Guest> AllGuest() {
        return guestMapper.AllGuest();
    }

    @Override
    public boolean addEmp(Guest guest) {
        return guestMapper.addEmp(guest);
    }

    @Override
    public Guest selectGuest(Guest guest) {
        return guestMapper.selectGuest(guest);
    }
}
