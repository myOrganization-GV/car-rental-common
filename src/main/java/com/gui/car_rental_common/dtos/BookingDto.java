package com.gui.car_rental_common.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

public class BookingDto {
    private String email;
    private UUID carId;
    private LocalDateTime rentalStartDate;
    private LocalDateTime rentalEndDate;

    public String getEmail() {
        return email;
    }


    public UUID getCarId() {
        return carId;
    }


    public LocalDateTime getRentalStartDate() {
        return rentalStartDate;
    }



    public LocalDateTime getRentalEndDate() {
        return rentalEndDate;
    }


    public BookingDto(String email, UUID carId, LocalDateTime rentalStartDate, LocalDateTime rentalEndDate) {
        this.email = email;
        this.carId = carId;
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
    }

    public BookingDto() {
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    public void setRentalStartDate(LocalDateTime rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public void setRentalEndDate(LocalDateTime rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }
}
