package com.example.demoheroku.model.repository;


import com.example.demoheroku.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
