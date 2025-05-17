package com.gui.car_rental_common.events.booking;

import com.gui.car_rental_common.dtos.BookingDto;

import java.util.UUID;

public class BookingCancellationFailedEvent {
    private UUID sagaTransactionId;
    private BookingDto bookingDto;
    private String message;

    public BookingCancellationFailedEvent(UUID sagaTransactionId, BookingDto bookingDto, String message) {
        this.sagaTransactionId = sagaTransactionId;
        this.bookingDto = bookingDto;
        this.message = message;
    }

    public BookingCancellationFailedEvent() {
    }

    public UUID getSagaTransactionId() {
        return sagaTransactionId;
    }

    public void setSagaTransactionId(UUID sagaTransactionId) {
        this.sagaTransactionId = sagaTransactionId;
    }

    public BookingDto getBookingDto() {
        return bookingDto;
    }

    public void setBookingDto(BookingDto bookingDto) {
        this.bookingDto = bookingDto;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
