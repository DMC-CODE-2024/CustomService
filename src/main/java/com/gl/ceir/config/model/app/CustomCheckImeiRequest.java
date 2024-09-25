package com.gl.ceir.config.model.app;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class CustomCheckImeiRequest {

    String imei;
    String serialNumber;

    @Override
    public String toString() {
        return "{" +
                "imei='" + imei + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
