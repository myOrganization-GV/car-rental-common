package com.gui.car_rental_common.commands;

import com.gui.car_rental_common.dtos.BookingDto;

import java.util.UUID;

public class PaymentCreationCommand {
    private UUID sagaTransactionId;
    private BookingDto bookingDto;

    public PaymentCreationCommand(UUID sagaTransactionId, BookingDto bookingDto) {
        this.sagaTransactionId = sagaTransactionId;
        this.bookingDto = bookingDto;
    }

    public PaymentCreationCommand() {
    }

    public BookingDto getBookingDto() {
        return bookingDto;
    }


    public UUID getSagaTransactionId() {
        return sagaTransactionId;
    }

    public void setBookingDto(BookingDto bookingDto) {
        this.bookingDto = bookingDto;
    }

    public void setSagaTransactionId(UUID sagaTransactionId) {
        this.sagaTransactionId = sagaTransactionId;
    }
}
