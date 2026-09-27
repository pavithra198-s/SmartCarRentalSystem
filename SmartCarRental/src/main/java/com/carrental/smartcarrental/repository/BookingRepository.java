package com.carrental.smartcarrental.repository;
import com.carrental.smartcarrental.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookingRepository extends JpaRepository<Booking,Long> {}
