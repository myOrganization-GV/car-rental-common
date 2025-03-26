package com.gui.car_rental_common.events.booking;

public class BookingCreationFailedEvent {

    private String sagaTransactionId;
    private String message;
    public BookingCreationFailedEvent(String sagaTransactionId) {
        this.sagaTransactionId = sagaTransactionId;
    }

    public String getSagaTransactionId() {
        return sagaTransactionId;
    }

    public void setSagaTransactionId(String sagaTransactionId) {
        this.sagaTransactionId = sagaTransactionId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
