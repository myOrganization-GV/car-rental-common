package com.gui.car_rental_common.events.booking;

import java.util.UUID;

public class BookingCreatedEvent {
    private UUID sagaTransactionId;

    public BookingCreatedEvent() {
    }

    public BookingCreatedEvent(UUID sagaTransactionId) {
        this.sagaTransactionId = sagaTransactionId;
    }

    public UUID getSagaTransactionId() {
        return sagaTransactionId;
    }

    public void setSagaTransactionId(UUID sagaTransactionId) {
        this.sagaTransactionId = sagaTransactionId;
    }

}
