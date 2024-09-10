package com.example.pos_system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.example.pos_system.dto.user.RoleDto;
import com.example.pos_system.model.Role;
import com.example.pos_system.repository.RoleRepository;
import com.example.pos_system.service.RoleService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, RoleDto, String> implements RoleService {
	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	ObjectMapper objectMapper;

	@Override
	public JpaRepository getRepository() {
		return roleRepository;
	}

	@Override
	protected RoleDto convertToDto(Role entity) {
		return objectMapper.convertValue(entity, RoleDto.class);
	}	

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return super.getAll();
	}	


}
