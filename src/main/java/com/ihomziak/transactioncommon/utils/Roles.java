package com.ihomziak.transactioncommon.utils;

public enum Roles {

    SUPER_ADMIN("Super Admin"),
    ADMIN("Admin"),
    SUPERVISOR("Supervisor"),
    CLIENT("Client");

    private final String role;

    Roles(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return this.role;
    }
}
