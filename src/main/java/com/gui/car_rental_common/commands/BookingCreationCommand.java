package com.gui.car_rental_common.commands;

import java.time.LocalDateTime;
import java.util.UUID;

public class BookingCreationCommand {
    private UUID carId;
    private LocalDateTime rentalStartDate;
    private LocalDateTime rentalEndDate;
    private UUID sagaTransactionId;


    public BookingCreationCommand() {
    }

    public BookingCreationCommand(UUID carId, LocalDateTime rentalStartDate, LocalDateTime rentalEndDate, UUID sagaTransactionId) {
        this.carId = carId;
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
        this.sagaTransactionId = sagaTransactionId;
    }

    public UUID getCarId() {
        return carId;
    }

    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    public LocalDateTime getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate(LocalDateTime rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public LocalDateTime getRentalEndDate() {
        return rentalEndDate;
    }

    public void setRentalEndDate(LocalDateTime rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }

    public UUID getSagaTransactionId() {
        return sagaTransactionId;
    }

    public void setSagaTransactionId(UUID sagaTransactionId) {
        this.sagaTransactionId = sagaTransactionId;
    }
}
