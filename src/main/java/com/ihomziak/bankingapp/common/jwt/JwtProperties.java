package com.ihomziak.bankingapp.common.jwt;

import lombok.Getter;

@Getter
public class JwtProperties {

    private final String secretKey;
    private final long validityInMilliseconds;

    public JwtProperties(String secretKey, long validityInMilliseconds) {
        this.secretKey = secretKey;
        this.validityInMilliseconds = validityInMilliseconds;
    }
}
