package com.service;

import com.model.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> AllGuest();
    Guest selectGuestById(Guest guest);
    Guest selectGuest(Guest guest);
    Guest selectGuestbyname(Guest guest);
    boolean addGuest(Guest guest);
    boolean updateGuest(Guest guest);
}
