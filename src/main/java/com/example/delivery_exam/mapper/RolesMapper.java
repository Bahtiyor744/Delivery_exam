package com.example.delivery_exam.mapper;

import com.example.delivery_exam.dto.RolesDTO;
import com.example.delivery_exam.entity.Roles;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RolesMapper {

    RolesMapper INSTANCE = Mappers.getMapper(RolesMapper.class);

    Roles toRoles(RolesDTO rolesDTO);
    RolesDTO toRolesDTO(Roles roles);
}
