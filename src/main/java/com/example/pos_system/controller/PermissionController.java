package com.example.pos_system.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.pos_system.dto.permission.PermissionDto;
import com.example.pos_system.model.Permission;
import com.example.pos_system.service.BaseService;
import com.example.pos_system.service.PermissionService;

@RestController
@RequestMapping("api/v1/permission")
public class PermissionController extends BaseController<Permission, PermissionDto, String>  {
	@Autowired
	private PermissionService permissionService;

	@Override
	public BaseService<Permission, PermissionDto, String> getService() { 
		return permissionService;
	}
}
