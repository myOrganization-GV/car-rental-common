package com.gui.car_rental_common.commands;

import com.gui.car_rental_common.dtos.BookingDto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class BookingCreationCommand {
    private UUID sagaTransactionId;
    private BookingDto bookingDto;

    public BookingCreationCommand() {
    }

    public BookingCreationCommand(UUID sagaTransactionId, BookingDto bookingDto) {
        this.sagaTransactionId = sagaTransactionId;
        this.bookingDto = bookingDto;
    }

    public UUID getSagaTransactionId() {
        return sagaTransactionId;
    }

    public BookingDto getBookingDto() {
        return bookingDto;
    }


    public void setSagaTransactionId(UUID sagaTransactionId) {
        this.sagaTransactionId = sagaTransactionId;
    }

    public void setBookingDto(BookingDto bookingDto) {
        this.bookingDto = bookingDto;
    }

}
