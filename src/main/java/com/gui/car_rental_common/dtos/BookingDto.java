package com.gui.car_rental_common.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class BookingDto {
    private String email;
    private UUID userId;
    private UUID carId;

    private UUID bookingId;
    private LocalDateTime rentalStartDate;
    private LocalDateTime rentalEndDate;
    private BigDecimal pricePerDay;

    private BigDecimal amount;
    private PaymentDto paymentDto;

    public BookingDto(String email, UUID userId, UUID carId, UUID bookingId, LocalDateTime rentalStartDate, LocalDateTime rentalEndDate, BigDecimal pricePerDay, BigDecimal amount, PaymentDto paymentDto) {
        this.email = email;
        this.userId = userId;
        this.carId = carId;
        this.bookingId = bookingId;
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
        this.pricePerDay = pricePerDay;
        this.amount = amount;
        this.paymentDto = paymentDto;
    }

    public BookingDto() {
    }

    public UUID getBookingId() {
        return bookingId;
    }

    public void setBookingId(UUID bookingId) {
        this.bookingId = bookingId;
    }

    public PaymentDto getPaymentDto() {
        return paymentDto;
    }

    public void setPaymentDto(PaymentDto paymentDto) {
        this.paymentDto = paymentDto;
    }

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

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setRentalStartDate(LocalDateTime rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public void setRentalEndDate(LocalDateTime rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }
}
