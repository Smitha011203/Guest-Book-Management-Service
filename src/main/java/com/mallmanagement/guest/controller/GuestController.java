package com.mallmanagement.guest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mallmanagement.guest.entity.Guest;
import com.mallmanagement.guest.service.GuestService;

@RestController
@RequestMapping("/guests")
@CrossOrigin(origins = "*")
public class GuestController {

    @Autowired
    private GuestService guestService;

    // POST new guest
    @PostMapping
    public Guest addGuest(@RequestBody Guest guest) {
        return guestService.saveGuest(guest);
    }

    // GET all guests
    @GetMapping
    public List<Guest> getGuests() {
        return guestService.getAllGuests();
    }
    @PutMapping("/{id}")
    public Guest updateGuest(@PathVariable Long id, @RequestBody Guest guest) {
        return guestService.updateGuest(id, guest);
    }
    @DeleteMapping("/{id}")
    public String deleteGuest(@PathVariable Long id) {
        guestService.deleteGuest(id);
        return "Guest deleted successfully";
    }


}
