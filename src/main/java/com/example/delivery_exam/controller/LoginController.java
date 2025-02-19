package com.example.delivery_exam.controller;

import com.example.delivery_exam.dto.LoginDTO;
import com.example.delivery_exam.dto.UserDTO;
import com.example.delivery_exam.entity.User;
import com.example.delivery_exam.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final TokenService tokenService;
    private final AuthenticationManager authenticationManager;

    @PostMapping
    public ResponseEntity<?> loginPage(@RequestBody LoginDTO loginDTO) {
        var usernamePasswordAuthenticationToken =
                new UsernamePasswordAuthenticationToken(loginDTO.getPhone(), loginDTO.getPassword());

        Authentication authenticate = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
        User user = (User) authenticate.getPrincipal();
        String token = tokenService.generateToken(user);
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setPhone(user.getPhone());
        userDTO.setRoles(user.getRoles());
        userDTO.setId(user.getId());
        Map<String, Object> response = new HashMap<>();
        response.put("token", token);
        response.put("user", userDTO);
        System.out.println(response);
        return ResponseEntity.ok(response);
    }
}
