package com.mallmanagement.guest.service;

import java.util.List;
import com.mallmanagement.guest.entity.Guest;

public interface GuestService {

    Guest saveGuest(Guest guest);
    Guest updateGuest(Long id, Guest guest);
    void deleteGuest(Long id);


    List<Guest> getAllGuests();
}
