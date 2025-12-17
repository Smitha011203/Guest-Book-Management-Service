package com.mallmanagement.guest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mallmanagement.guest.entity.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
