package com.example.delivery_exam.repo;

import com.example.delivery_exam.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}