package com.gui.car_rental_common.commands;

import com.gui.car_rental_common.dtos.BookingDto;

import java.util.UUID;

public class CancelBookingCommand {
    private UUID sagaTransactionId;
    private BookingDto bookingDto;


    public CancelBookingCommand() {
    }

    public CancelBookingCommand(UUID sagaTransactionId, BookingDto bookingDto) {
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
