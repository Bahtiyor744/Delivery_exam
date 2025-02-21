package com.example.delivery_exam.mapper;


import com.example.delivery_exam.dto.UserDTO;
import com.example.delivery_exam.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
   UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

   UserDTO userToUserDTO(User user);
   User userDTOToUser(UserDTO userDTO);

}
