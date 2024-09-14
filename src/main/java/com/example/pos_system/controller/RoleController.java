package com.example.pos_system.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pos_system.dto.user.RoleDto;
import com.example.pos_system.model.Role;
import com.example.pos_system.service.BaseService;
import com.example.pos_system.service.RoleService;

@RestController
@RequestMapping("/api/v1/role")
public class RoleController extends BaseController<Role, RoleDto, String> {	

	@Autowired
	private RoleService roleService;

	@Override
	public BaseService<Role, RoleDto, String> getService() {
		return roleService;
	}

}
