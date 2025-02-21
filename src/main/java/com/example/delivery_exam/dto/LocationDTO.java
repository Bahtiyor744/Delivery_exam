package com.example.delivery_exam.dto;

import lombok.Value;

@Value
public class LocationDTO {
    Integer id;
    Double latitude;
    Double longitude;
    String address;
}