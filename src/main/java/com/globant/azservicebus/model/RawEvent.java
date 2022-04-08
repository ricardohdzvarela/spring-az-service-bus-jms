package com.globant.azservicebus.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RawEvent {

    private String id;
    private String version;
    private String message;
    private String payload;
    private ProductType type;
    private long created;
    private String correlationId;
    private String transactionId;
}
