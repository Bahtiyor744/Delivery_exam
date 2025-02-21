package com.example.delivery_exam.dto;

import lombok.Value;

@Value
public class OrderItemDTO {
    Integer id;
    Integer orderId;
    Integer productId;
    int quantity;
}
