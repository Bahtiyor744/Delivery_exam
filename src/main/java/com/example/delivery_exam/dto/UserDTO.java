package com.example.delivery_exam.dto;

import com.example.delivery_exam.entity.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String phone;
    private List<Roles> roles;
    public String getFull(){
        return firstName + " " + lastName;
    }


}
