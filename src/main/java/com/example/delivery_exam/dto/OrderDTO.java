package com.example.delivery_exam.dto;

import lombok.Value;
import java.math.BigDecimal;
import java.util.List;

@Value
public class OrderDTO {
    Integer id;
    Integer userId;
    List<OrderItemDTO> orderItems;
    BigDecimal totalPrice;
}
