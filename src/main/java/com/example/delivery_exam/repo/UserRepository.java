package com.example.delivery_exam.repo;

import com.example.delivery_exam.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByPhone(String username);
}