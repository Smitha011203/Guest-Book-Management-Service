package com.mallmanagement.guest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mallmanagement.guest.entity.Guest;
import com.mallmanagement.guest.repository.GuestRepository;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestRepository guestRepository;

    @Override
    public Guest saveGuest(Guest guest) {
        return guestRepository.save(guest);
    }

    @Override
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }
    @Override
    public void deleteGuest(Long id) {
        guestRepository.deleteById(id);
    }

    @Override
    public Guest updateGuest(Long id, Guest guest) {
        Guest existingGuest = guestRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Guest not found"));

        existingGuest.setName(guest.getName());
        existingGuest.setEmail(guest.getEmail());
        existingGuest.setMessage(guest.getMessage());

        return guestRepository.save(existingGuest);
    }

}
