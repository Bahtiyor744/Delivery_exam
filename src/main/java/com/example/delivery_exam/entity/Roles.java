package com.example.delivery_exam.entity;


import com.example.delivery_exam.base.BaseEntity;
import com.example.delivery_exam.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Roles extends BaseEntity implements GrantedAuthority {
    @Enumerated(EnumType.STRING)
    private UserRole role;
    @Override
    public String getAuthority() {
        return this.role.name();
    }
}
