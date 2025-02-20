package com.example.delivery_exam.entity;

import com.example.delivery_exam.base.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category extends BaseEntity {
    private String name;
}
