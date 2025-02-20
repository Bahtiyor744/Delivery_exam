package com.example.delivery_exam.repo;

import com.example.delivery_exam.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}