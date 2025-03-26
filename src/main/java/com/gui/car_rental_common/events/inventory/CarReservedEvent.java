package com.gui.car_rental_common.events.inventory;

import java.util.UUID;

public class CarReservedEvent {
    private UUID carId;
    private UUID sagaTransactionId;

    public CarReservedEvent() {
    }

    public CarReservedEvent(UUID carId, UUID sagaTransactionId) {
        this.carId = carId;
        this.sagaTransactionId = sagaTransactionId;
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
}
