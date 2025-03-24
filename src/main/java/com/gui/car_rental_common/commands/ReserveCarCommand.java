package com.gui.car_rental_common.commands;

import java.util.UUID;

public class ReserveCarCommand {
    private UUID carId;
    private String sagaTransactionId;

    public ReserveCarCommand() {
    }

    public ReserveCarCommand(UUID carId, String sagaTransactionId) {
        this.carId = carId;
        this.sagaTransactionId = sagaTransactionId;
    }

    public UUID getCarId() {
        return carId;
    }

    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    public String getSagaTransactionId() {
        return sagaTransactionId;
    }

    public void setSagaTransactionId(String sagaTransactionId) {
        this.sagaTransactionId = sagaTransactionId;
    }



}
