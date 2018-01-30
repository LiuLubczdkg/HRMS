package com.dao;

import com.model.Guest;

import java.util.List;

public interface GuestMapper {
    List<Guest> AllGuest();
    boolean addGuest(Guest guest);
    Guest selectGuest(Guest guest);
    Guest selectGuestbyname(Guest guest);
}
