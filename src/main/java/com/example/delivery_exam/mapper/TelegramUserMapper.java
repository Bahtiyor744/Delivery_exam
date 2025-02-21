package com.example.delivery_exam.mapper;

import com.example.delivery_exam.dto.TelegramUserDTO;
import com.example.delivery_exam.entity.TelegramUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TelegramUserMapper {

    TelegramUserMapper INSTANCE = Mappers.getMapper(TelegramUserMapper.class);

    TelegramUserDTO toTelegramUserDTO(TelegramUser telegramUser);
    TelegramUser toTelegramUser(TelegramUserDTO telegramUserDTO);
}
