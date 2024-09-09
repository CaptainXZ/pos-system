package com.example.pos_system.dto.permission;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PermissionDto {
	private String id;
	private String name;
	private String module; 
	private String slug;
	private String status;
}
