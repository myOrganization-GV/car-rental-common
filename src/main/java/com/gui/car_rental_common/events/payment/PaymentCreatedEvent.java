package com.gui.car_rental_common.events.payment;

import com.gui.car_rental_common.dtos.BookingDto;

import java.util.UUID;

public class PaymentCreatedEvent {
    private UUID sagaTransactionId;

    private BookingDto bookingDto;


    public PaymentCreatedEvent(UUID sagaTransactionId, BookingDto bookingDto) {
        this.sagaTransactionId = sagaTransactionId;
        this.bookingDto = bookingDto;
    }

    public PaymentCreatedEvent() {
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
