package com.example.pos_system.dto.brand;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrandDto {
	private String id;
	private String name;
	private String description;
	private String status;
}
