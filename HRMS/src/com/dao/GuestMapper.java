package com.dao;

import com.model.Guest;

import java.util.List;

public interface GuestMapper {
    List<Guest> AllGuest();
    Guest selectGuest(Guest guest);
    Guest selectGuestById(Guest guest);
    Guest selectGuestbyname(Guest guest);
    boolean addGuest(Guest guest);
    boolean updateGuest(Guest guest);
}
