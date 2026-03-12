package com.hotelbookingapi.hotel_booking_api.controller;

import com.hotelbookingapi.hotel_booking_api.model.Booking;
import com.hotelbookingapi.hotel_booking_api.service.BookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping
    public List<Booking> getBookings() {
        return bookingService.getBookings();
    }

    @PostMapping
    public ResponseEntity<?> addBooking(@RequestBody Booking booking) {

        try {
            Booking newBooking = bookingService.addBooking(booking);
            return ResponseEntity.ok(newBooking);

        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());

        } catch (IllegalStateException e) {
            return ResponseEntity.status(409).body(e.getMessage());
        }
    }
}