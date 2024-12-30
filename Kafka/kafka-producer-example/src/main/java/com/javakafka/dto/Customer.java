package com.javakafka.dto;

import lombok.Data;
import org.apache.kafka.common.protocol.types.Field;

@Data
public class Customer {

    private int id;
    private String name;
    private String email;
    private String contactNo;
}
