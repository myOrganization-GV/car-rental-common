package com.gui.car_rental_common.events.inventory;

import com.gui.car_rental_common.dtos.BookingDto;

import java.util.UUID;

public class CarReservationFailedEvent {

    private BookingDto bookingDto;
    private UUID sagaTransactionId;
    private String message;

    public CarReservationFailedEvent() {
    }

    public CarReservationFailedEvent(BookingDto bookingDto, UUID sagaTransactionId, String message) {
        this.bookingDto = bookingDto;
        this.sagaTransactionId = sagaTransactionId;
        this.message = message;
    }

    public BookingDto getBookingDto() {
        return bookingDto;
    }

    public UUID getSagaTransactionId() {
        return sagaTransactionId;
    }

    public String getMessage() {
        return message;
    }

    public void setBookingDto(BookingDto bookingDto) {
        this.bookingDto = bookingDto;
    }

    public void setSagaTransactionId(UUID sagaTransactionId) {
        this.sagaTransactionId = sagaTransactionId;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
