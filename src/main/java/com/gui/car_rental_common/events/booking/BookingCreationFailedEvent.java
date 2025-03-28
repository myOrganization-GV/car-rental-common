package com.gui.car_rental_common.events.booking;

import com.gui.car_rental_common.dtos.BookingDto;

import java.util.UUID;

public class BookingCreationFailedEvent {

    private UUID sagaTransactionId;

    private BookingDto bookingDto;
    private String message;
    public BookingCreationFailedEvent(UUID sagaTransactionId, BookingDto bookingDto) {
        this.sagaTransactionId = sagaTransactionId;
        this.bookingDto = bookingDto;
    }

    public BookingCreationFailedEvent() {
    }

    public UUID getSagaTransactionId() {
        return sagaTransactionId;
    }

    public void setSagaTransactionId(UUID sagaTransactionId) {
        this.sagaTransactionId = sagaTransactionId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BookingDto getBookingDto() {
        return bookingDto;
    }

    public void setBookingDto(BookingDto bookingDto) {
        this.bookingDto = bookingDto;
    }
}
