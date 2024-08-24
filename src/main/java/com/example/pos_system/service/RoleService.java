package com.example.pos_system.service;

import org.springframework.stereotype.Service;

import com.example.pos_system.dto.user.RoleDto;
import com.example.pos_system.model.Role;

@Service
public interface RoleService extends BaseService<Role, RoleDto, String> {
}