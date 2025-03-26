package com.gui.car_rental_common.commands;

import java.time.LocalDateTime;
import java.util.UUID;

public class UpdateBookingCommand {
    private UUID carId;
    private UUID userId;
    private UUID bookingId;
    private String userName;
    private LocalDateTime rentalStartDate;
    private LocalDateTime rentalEndDate;
    private UUID sagaTransactionId;


    public UpdateBookingCommand() {
    }

    public UpdateBookingCommand(UUID carId, UUID userId, UUID bookingId, String userName, LocalDateTime rentalStartDate, LocalDateTime rentalEndDate, UUID sagaTransactionId) {
        this.carId = carId;
        this.userId = userId;
        this.bookingId = bookingId;
        this.userName = userName;
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

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public UUID getBookingId() {
        return bookingId;
    }

    public void setBookingId(UUID bookingId) {
        this.bookingId = bookingId;
    }
}
