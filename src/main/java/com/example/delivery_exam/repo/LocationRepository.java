package com.example.delivery_exam.repo;

import com.example.delivery_exam.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}