package com.ihomziak.bankingapp.common.utils;

public enum TransactionStatus {
    NEW("NEW"),
    CREATED("CREATED"),
    STARTED("STARTED"),
    COMPLETED("COMPLETED"),
    DECLINED("DECLINED"),
    CANCELED("CANCELED"),
    FAILED("FAILED");

    private final String status;

    private TransactionStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.status;
    }
}
