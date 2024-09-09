package com.example.pos_system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.example.pos_system.dto.permission.PermissionDto;
import com.example.pos_system.model.Permission;
import com.example.pos_system.repository.PermissionRepository;
import com.example.pos_system.service.PermissionService;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

@Service
public class PermissionServiceImpl extends BaseServiceImpl<Permission , PermissionDto, String>
implements PermissionService
{
	@Autowired
	private PermissionRepository permissionRepository;

	@Autowired
	ObjectMapper objectMapper;


	@Override
	public JpaRepository<Permission, String> getRepository() {
		return permissionRepository;
	}

	@Override
	protected PermissionDto convertToDto(Permission entity) {
		return objectMapper.convertValue(entity, PermissionDto.class);
	}	

	@Override
	public List <Permission> getAll() {
		return super.getAll();
	}	

	@Override	
	public Page<PermissionDto> getAllWithPaginationAndSearch(Pageable pageable, String content) {
		Page<Permission> entities = permissionRepository.findByStatus("ACTIVE", pageable);
		return entities.map(this::convertToDto);
	}
}
