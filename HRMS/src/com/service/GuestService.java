package com.service;

import com.model.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> AllGuest();
    boolean addGuest(Guest guest);
    Guest selectGuest(Guest guest);
    Guest selectGuestbyname(Guest guest);
    boolean updateGuest(Guest guest);
}
