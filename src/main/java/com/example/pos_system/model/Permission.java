package com.example.pos_system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_permissions")
public class Permission extends BaseEntity<String> {
	@NotBlank
    @Column(name = "name", nullable = false)
	private String name;
	@NotBlank
    @Column(name = "slug", nullable = false)
	private String slug;
	@NotBlank
    @Column(name = "module", nullable = false)
	private String module;
}
