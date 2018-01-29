package com.service;

import com.model.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> AllGuest();
    boolean addEmp(Guest guest);
    Guest selectGuest(Guest guest);
}
