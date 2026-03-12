package com.hotelbookingapi.hotel_booking_api.model;

import java.time.LocalDate;

public class Booking {

    private String clientName;
    private String phone;
    private String email;
    private int roomNumber;
    private String roomDescription;
    private LocalDate bookingDate;

    public Booking(String clientName, String phone, String email,
                   int roomNumber, String roomDescription, LocalDate bookingDate) {
        this.clientName = clientName;
        this.phone = phone;
        this.email = email;
        this.roomNumber = roomNumber;
        this.roomDescription = roomDescription;
        this.bookingDate = bookingDate;
    }

    public String getClientName() { return clientName; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public int getRoomNumber() { return roomNumber; }
    public String getRoomDescription() { return roomDescription; }
    public LocalDate getBookingDate() { return bookingDate; }
}
