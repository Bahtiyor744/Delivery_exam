package com.example.delivery_exam.mapper222;


import com.example.delivery_exam.dto.OrderDTO;
import com.example.delivery_exam.entity.Order;
import com.example.delivery_exam.mapper.OrderMapper;
import com.example.delivery_exam.repo.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
        this.orderMapper = OrderMapper.INSTANCE;
    }

    public List<OrderDTO> getAllOrders() {
        return orderRepository.findAll().stream()
                .map(orderMapper::toOrderDTO)
                .collect(Collectors.toList());
    }

    public OrderDTO getOrderById(Integer id) {
        Optional<Order> order = orderRepository.findById(id);
        return order.map(orderMapper::toOrderDTO).orElse(null);
    }

    public OrderDTO createOrder(OrderDTO orderDTO) {
        Order order = orderMapper.toOrder(orderDTO);
        order = orderRepository.save(order);
        return orderMapper.toOrderDTO(order);
    }

    public OrderDTO updateOrder(Integer id, OrderDTO orderDTO) {
        if (!orderRepository.existsById(id)) {
            return null;
        }
        Order order = orderMapper.toOrder(orderDTO);
        order.setId(id);
        order = orderRepository.save(order);
        return orderMapper.toOrderDTO(order);
    }

    public void deleteOrder(Integer id) {
        orderRepository.deleteById(id);
    }
}

