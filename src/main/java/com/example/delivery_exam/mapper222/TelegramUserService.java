package com.example.delivery_exam.mapper222;


import com.example.delivery_exam.dto.TelegramUserDTO;
import com.example.delivery_exam.entity.TelegramUser;
import com.example.delivery_exam.mapper.TelegramUserMapper;
import com.example.delivery_exam.repo.TelegramUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TelegramUserService {

    private final TelegramUserRepository telegramUserRepository;
    private final TelegramUserMapper telegramUserMapper;

    public TelegramUserService(TelegramUserRepository telegramUserRepository) {
        this.telegramUserRepository = telegramUserRepository;
        this.telegramUserMapper = TelegramUserMapper.INSTANCE;
    }

    public List<TelegramUserDTO> getAllTelegramUsers() {
        return telegramUserRepository.findAll().stream()
                .map(telegramUserMapper::toTelegramUserDTO)
                .collect(Collectors.toList());
    }

    public TelegramUserDTO getTelegramUserById(Integer id) {
        Optional<TelegramUser> user = telegramUserRepository.findById(id);
        return user.map(telegramUserMapper::toTelegramUserDTO).orElse(null);
    }

    public TelegramUserDTO createTelegramUser(TelegramUserDTO telegramUserDTO) {
        TelegramUser user = telegramUserMapper.toTelegramUser(telegramUserDTO);
        user = telegramUserRepository.save(user);
        return telegramUserMapper.toTelegramUserDTO(user);
    }

    public TelegramUserDTO updateTelegramUser(Integer id, TelegramUserDTO telegramUserDTO) {
        if (!telegramUserRepository.existsById(id)) {
            return null;
        }
        TelegramUser user = telegramUserMapper.toTelegramUser(telegramUserDTO);
        user.setId(id);
        user = telegramUserRepository.save(user);
        return telegramUserMapper.toTelegramUserDTO(user);
    }

    public void deleteTelegramUser(Integer id) {
        telegramUserRepository.deleteById(id);
    }
}
