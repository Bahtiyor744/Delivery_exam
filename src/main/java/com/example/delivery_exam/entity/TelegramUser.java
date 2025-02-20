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
public class TelegramUser extends BaseEntity {
    private Long telegramId;
    private String username;
    private String firstName;
    private String lastName;
    private String phoneNumber;
}