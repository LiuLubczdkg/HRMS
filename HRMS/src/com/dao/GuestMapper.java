package com.dao;

import com.model.Guest;

import java.util.List;

public interface GuestMapper {
    List<Guest> AllGuest();
    boolean addEmp(Guest guest);
    Guest selectGuest(Guest guest);

}
