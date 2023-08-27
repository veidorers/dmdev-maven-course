package com.example.service;

import com.example.service.service.UserService;

public class AppRunner {
    public static void main(String[] args) {
        var userService = new UserService();
        System.out.println(userService.getUser(2L));
    }
}
