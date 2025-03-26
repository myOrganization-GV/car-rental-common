package com.gui.car_rental_common.commands;

import java.util.UUID;

public class ReserveCarCommand {
    private UUID carId;
    private UUID sagaTransactionId;

    public ReserveCarCommand() {
    }

    public ReserveCarCommand(UUID carId, UUID sagaTransactionId) {
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
