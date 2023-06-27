package com.grupo9.blueticket.models.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class SaveRolePermissionDTO {
	@NotEmpty
	private UUID id_role;
	@NotEmpty
	private UUID id_permission;
}