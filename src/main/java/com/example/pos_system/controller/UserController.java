package com.example.pos_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.pos_system.dto.user.UserDto;
import com.example.pos_system.model.User;
import com.example.pos_system.service.BaseService;
import com.example.pos_system.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserController extends BaseController<User, UserDto, String> {

    @Autowired
    private UserService userService;

    @Override
    public BaseService<User, UserDto, String> getService() {
        return userService;
    }
}
