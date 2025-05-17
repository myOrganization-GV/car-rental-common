package com.gui.car_rental_common.events.inventory;

import com.gui.car_rental_common.dtos.BookingDto;

import java.math.BigDecimal;
import java.util.UUID;

public class CarReservedEvent {
    private UUID sagaTransactionId;
    private BookingDto bookingDto;

    public CarReservedEvent() {
    }

    public CarReservedEvent(UUID sagaTransactionId, BookingDto bookingDto) {
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
