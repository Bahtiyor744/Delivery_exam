package com.example.delivery_exam.mapper;

import com.example.delivery_exam.entity.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderItemMapper {

    OrderItemMapper INSTANCE = Mappers.getMapper(OrderItemMapper.class);

    OrderItem toOrderItem(OrderItem orderItem);
    OrderItem toOrder(OrderItem orderItem);


}
