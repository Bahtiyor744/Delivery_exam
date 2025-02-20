package com.example.delivery_exam.entity;

import com.example.delivery_exam.base.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Location extends BaseEntity {
    private Double latitude;
    private Double longitude;
    private String address;
}
