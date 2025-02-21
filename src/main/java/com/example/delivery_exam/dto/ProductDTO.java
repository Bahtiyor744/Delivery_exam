package com.example.delivery_exam.dto;

import lombok.Value;
import java.math.BigDecimal;

@Value
public class ProductDTO {
    Integer id;
    String name;
    BigDecimal price;
    Integer categoryId;
    Integer attachmentId;
}