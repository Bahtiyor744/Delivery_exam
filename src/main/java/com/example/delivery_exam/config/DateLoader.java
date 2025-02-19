package com.example.delivery_exam.config;

import com.example.delivery_exam.entity.Roles;
import com.example.delivery_exam.entity.User;
import com.example.delivery_exam.repo.RolesRepository;
import com.example.delivery_exam.repo.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DateLoader implements CommandLineRunner {
    private final RolesRepository rolesRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public DateLoader(RolesRepository rolesRepository, PasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.rolesRepository = rolesRepository;
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Roles> rolesList = rolesRepository.findAll();
        List<Roles> rolesOperator = new ArrayList<>(List.of(rolesList.get(0)));
        User user = new User("Admin", "Admin", "1", passwordEncoder.encode("1"), rolesList);
        User user1 = new User("Operator", "Operator", "2", passwordEncoder.encode("2"), rolesOperator);
        userRepository.save(user);
        userRepository.save(user1);


    }
}
