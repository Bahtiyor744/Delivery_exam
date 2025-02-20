package com.example.delivery_exam.repo;

import com.example.delivery_exam.entity.TelegramUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelegramUserRepository extends JpaRepository<TelegramUser, Integer> {
  }