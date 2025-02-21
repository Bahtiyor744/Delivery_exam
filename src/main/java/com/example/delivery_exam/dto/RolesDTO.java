package com.example.delivery_exam.dto;

import lombok.Value;
import com.example.delivery_exam.enums.UserRole;

@Value
public class RolesDTO {
    Integer id;
    UserRole role;
}
