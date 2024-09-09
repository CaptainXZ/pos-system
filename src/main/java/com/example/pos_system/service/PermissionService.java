package com.example.pos_system.service;
import org.springframework.stereotype.Service;

import com.example.pos_system.dto.permission.PermissionDto;
import com.example.pos_system.model.Permission;

@Service
public interface PermissionService extends BaseService<Permission, PermissionDto, String> {
	
}
