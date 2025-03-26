package com.gui.car_rental_common.events.inventory;

import java.util.UUID;

public class CarReservationFailedEvent {

    private UUID carId;

    private UUID sagaTransactionId;
    private String message;
    public CarReservationFailedEvent(){}
    public CarReservationFailedEvent(UUID carId, UUID sagaTransactionId, String message) {
        this.carId = carId;
        this.sagaTransactionId = sagaTransactionId;
        this.message = message;
    }

    public UUID getCarId() {
        return carId;
    }

    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    public UUID getSagaTransactionId() {
        return sagaTransactionId;
    }

    public void setSagaTransactionId(UUID sagaTransactionId) {
        this.sagaTransactionId = sagaTransactionId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
