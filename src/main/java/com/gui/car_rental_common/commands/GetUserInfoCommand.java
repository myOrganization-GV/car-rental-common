package com.gui.car_rental_common.commands;

import java.util.UUID;

public class GetUserInfoCommand {

    private String email;
    private UUID sagaTransactionId;
    public GetUserInfoCommand() {
    }

    public GetUserInfoCommand(String email, UUID sagaTransactionId) {
        this.email = email;
        this.sagaTransactionId = sagaTransactionId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getSagaTransactionId() {
        return sagaTransactionId;
    }

    public void setSagaTransactionId(UUID sagaTransactionId) {
        this.sagaTransactionId = sagaTransactionId;
    }
}
