package com.hotelbookingapi.hotel_booking_api.service;


import com.hotelbookingapi.hotel_booking_api.model.Booking;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {

    private final List<Booking> bookings = new ArrayList<>();

    public List<Booking> getBookings() {
        return bookings;
    }

    public Booking addBooking(Booking booking) {
        if (booking.getRoomNumber() < 1 || booking.getRoomNumber() > 9) {
            throw new IllegalArgumentException("Room numbers must be between 1 and 9");
        }
        for (Booking b : bookings) {
            if (b.getRoomNumber() == booking.getRoomNumber()
                    && b.getBookingDate().equals(booking.getBookingDate())) {

                throw new IllegalStateException("Room already booked for this date");
            }
        }

        bookings.add(booking);
        return booking;
    }
}
