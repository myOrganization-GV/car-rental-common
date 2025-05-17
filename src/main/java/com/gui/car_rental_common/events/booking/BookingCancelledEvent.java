package com.gui.car_rental_common.events.booking;

import com.gui.car_rental_common.dtos.BookingDto;

import java.util.UUID;

public class BookingCancelledEvent {


    private UUID sagaTransactionId;
    private BookingDto bookingDto;

    public BookingCancelledEvent() {
    }

    public BookingCancelledEvent(UUID sagaTransactionId, BookingDto bookingDto) {
        this.sagaTransactionId = sagaTransactionId;
        this.bookingDto = bookingDto;
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


}
