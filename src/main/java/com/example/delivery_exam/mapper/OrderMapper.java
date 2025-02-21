package com.example.delivery_exam.mapper;

import com.example.delivery_exam.dto.OrderDTO;
import com.example.delivery_exam.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDTO toOrderDTO(Order order);
    Order toOrder(OrderDTO orderDTO);
}
