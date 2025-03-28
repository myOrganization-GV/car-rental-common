package com.gui.car_rental_common.commands;

import com.gui.car_rental_common.dtos.BookingDto;

import java.util.UUID;

public class ReserveCarCommand {
    private BookingDto bookingDto;
    private UUID sagaTransactionId;

    public ReserveCarCommand(BookingDto bookingDto, UUID sagaTransactionId) {
        this.bookingDto = bookingDto;
        this.sagaTransactionId = sagaTransactionId;
    }

    public ReserveCarCommand() {
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
