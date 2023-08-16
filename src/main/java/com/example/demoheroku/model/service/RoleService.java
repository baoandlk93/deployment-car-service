package com.example.demoheroku.model.service;


import com.example.demoheroku.model.dto.RoleDto;
import com.example.demoheroku.model.entity.Role;

import java.util.Optional;

public interface RoleService {

    Iterable<RoleDto> findAll();
    Optional<Role> findById(Long id);
    void save(RoleDto roleDto);
    void remove(Long id);
}
