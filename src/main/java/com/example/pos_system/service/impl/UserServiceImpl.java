package com.example.pos_system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.pos_system.dto.user.UserDto;
import com.example.pos_system.model.User;
import com.example.pos_system.repository.UserRepository;
import com.example.pos_system.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserDto, String> 
implements UserService {
	@Autowired
    private UserRepository userRepository;
    @Autowired
    ObjectMapper objectMapper;

    @Override
    public JpaRepository<User, String>  getRepository() {
        return userRepository;
    }
    @Override
    protected UserDto convertToDto(User entity) {
        return objectMapper.convertValue(entity, UserDto.class);
    }
    @Override
    public List<User> getAll() {
        return super.getAll();
    }

	@Override
	public User create(User entity) {
		entity.setPassword(new BCryptPasswordEncoder().encode(entity.getPassword()));
		return super.create(entity);
	}
}

