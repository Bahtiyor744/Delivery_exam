package com.example.delivery_exam.mapper;

import com.example.delivery_exam.dto.LocationDTO;
import com.example.delivery_exam.entity.Location;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LocationMapper {
    LocationMapper INSTANCE = Mappers.getMapper(LocationMapper.class);

    LocationDTO toLocationDTO(Location location);
    Location toLocation(LocationDTO locationDTO);
}
