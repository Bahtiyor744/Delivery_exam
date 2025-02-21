package com.example.delivery_exam.dto;

import lombok.Value;

@Value
public class TelegramUserDTO {
    Integer id;
    Long telegramId;
    String username;
    String firstName;
    String lastName;
    String phoneNumber;
}
