package com.example.delivery_exam.service;


import com.example.delivery_exam.dto.RolesDTO;
import com.example.delivery_exam.entity.Roles;
import com.example.delivery_exam.mapper.RolesMapper;
import com.example.delivery_exam.repo.RolesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RolesService {

    private final RolesRepository rolesRepository;
    private final RolesMapper rolesMapper;

    public RolesService(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
        this.rolesMapper = RolesMapper.INSTANCE;
    }

    public List<RolesDTO> getAllRoles() {
        return rolesRepository.findAll().stream()
                .map(rolesMapper::toRolesDTO)
                .collect(Collectors.toList());
    }

    public RolesDTO getRoleById(Integer id) {
        Optional<Roles> role = rolesRepository.findById(id);
        return role.map(rolesMapper::toRolesDTO).orElse(null);
    }

    public RolesDTO createRole(RolesDTO rolesDTO) {
        Roles role = rolesMapper.toRoles(rolesDTO);
        role = rolesRepository.save(role);
        return rolesMapper.toRolesDTO(role);
    }

    public RolesDTO updateRole(Integer id, RolesDTO rolesDTO) {
        if (!rolesRepository.existsById(id)) {
            return null;
        }
        Roles role = rolesMapper.toRoles(rolesDTO);
        role.setId(id);
        role = rolesRepository.save(role);
        return rolesMapper.toRolesDTO(role);
    }

    public void deleteRole(Integer id) {
        rolesRepository.deleteById(id);
    }
}

