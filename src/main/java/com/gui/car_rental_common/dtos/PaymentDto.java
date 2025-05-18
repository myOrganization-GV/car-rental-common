package com.gui.car_rental_common.dtos;

import jakarta.validation.constraints.NotNull;

public class PaymentDto {
    @NotNull
    private String cardToken;
    @NotN
    private String paymentMethod;

    private String payerEmail;

   private String payerFirstName;
    private String payerLastName;

    private String payerIdentificationType;
    private String payerIdentificationNumber;
    private String externalReference;

    public PaymentDto() {
    }


    public PaymentDto(String cardToken, String paymentMethod, String payerEmail, String payerFirstName, String payerLastName, String payerIdentificationType, String payerIdentificationNumber, String externalReference) {
        this.cardToken = cardToken;
        this.paymentMethod = paymentMethod;
        this.payerEmail = payerEmail;
        this.payerFirstName = payerFirstName;
        this.payerLastName = payerLastName;
        this.payerIdentificationType = payerIdentificationType;
        this.payerIdentificationNumber = payerIdentificationNumber;
        this.externalReference = externalReference;
    }

    public String getCardToken() {
        return cardToken;
    }

    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPayerEmail() {
        return payerEmail;
    }

    public void setPayerEmail(String payerEmail) {
        this.payerEmail = payerEmail;
    }

    public String getPayerFirstName() {
        return payerFirstName;
    }

    public void setPayerFirstName(String payerFirstName) {
        this.payerFirstName = payerFirstName;
    }

    public String getPayerLastName() {
        return payerLastName;
    }

    public void setPayerLastName(String payerLastName) {
        this.payerLastName = payerLastName;
    }

    public String getPayerIdentificationType() {
        return payerIdentificationType;
    }

    public void setPayerIdentificationType(String payerIdentificationType) {
        this.payerIdentificationType = payerIdentificationType;
    }

    public String getPayerIdentificationNumber() {
        return payerIdentificationNumber;
    }

    public void setPayerIdentificationNumber(String payerIdentificationNumber) {
        this.payerIdentificationNumber = payerIdentificationNumber;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }
}
