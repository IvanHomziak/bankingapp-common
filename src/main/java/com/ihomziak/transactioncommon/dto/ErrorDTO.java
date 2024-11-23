package com.ihomziak.transactioncommon.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ErrorDTO {
    private String error;

    public ErrorDTO(String error) {
        this.error = error;
    }

}