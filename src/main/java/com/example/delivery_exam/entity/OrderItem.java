package com.example.delivery_exam.entity;


import com.example.delivery_exam.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderItem extends BaseEntity {

    @ManyToOne
    private Order order;

    @ManyToOne
    private Product product;

    private int quantity;
}
