package com.service.impl;

import com.dao.GuestMapper;
import com.model.Guest;
import com.service.GuestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("GuestService")
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
    public boolean addGuest(Guest guest) {
        return guestMapper.addGuest(guest);
    }

    @Override
    public Guest selectGuest(Guest guest) {
        Guest guest1= guestMapper.selectGuest(guest);
        System.out.println(guest1);
        return guest1;
    }

    @Override
    public Guest selectGuestbyname(Guest guest) {
        return guestMapper.selectGuestbyname(guest);
    }

    @Override
    public boolean updateGuest(Guest guest) {
        return guestMapper.updateGuest(guest);
    }
}
