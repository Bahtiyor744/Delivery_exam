package com.example.delivery_exam.service;


import com.example.delivery_exam.dto.UserDTO;
import com.example.delivery_exam.entity.User;
import com.example.delivery_exam.mapper.UserMapper;
import com.example.delivery_exam.repo.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.userMapper = UserMapper.INSTANCE;
    }

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::userToUserDTO)
                .collect(Collectors.toList());
    }

    public UserDTO getUserById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.map(userMapper::userToUserDTO).orElse(null);
    }

    public UserDTO createUser(UserDTO userDTO) {
        User user = userMapper.userDTOToUser(userDTO);
        user = userRepository.save(user);
        return userMapper.userToUserDTO(user);
    }

    public UserDTO updateUser(Integer id, UserDTO userDTO) {
        if (!userRepository.existsById(id)) {
            return null;
        }
        User user = userMapper.userDTOToUser(userDTO);
        user.setId(id);
        user = userRepository.save(user);
        return userMapper.userToUserDTO(user);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}

