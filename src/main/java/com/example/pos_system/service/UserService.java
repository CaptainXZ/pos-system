package com.example.pos_system.service;
import org.springframework.stereotype.Service;

import com.example.pos_system.dto.user.UserDto;
import com.example.pos_system.model.User;

@Service
public interface UserService extends BaseService<User, UserDto, String> {
}
