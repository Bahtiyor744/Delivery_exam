package com.example.delivery_exam.entity;

import com.example.delivery_exam.base.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product extends BaseEntity {
    private String name;
    private BigDecimal price;

    @ManyToOne
    private Category category;

    @OneToOne
    private Attachment attachment;
}
