package com.example.service.service;

import com.example.database.dao.UserDao;
import com.example.service.dto.UserDto;

import java.util.Optional;

public class UserService {
    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(1L)
                .map(it -> new UserDto());
    }
}
