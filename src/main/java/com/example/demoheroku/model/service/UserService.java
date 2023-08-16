package com.example.demoheroku.model.service;


import com.example.demoheroku.model.dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDto> getUsers();
    List<UserDto> getUsersByFullName(String fullName);
    UserDto getUserById(Integer userId);
    Iterable<UserDto> findAll();
    Optional<UserDto> findById(Integer id);
    boolean save(UserDto userDto);
    void remove(Integer id);

    String getNameUser(String username);
}
