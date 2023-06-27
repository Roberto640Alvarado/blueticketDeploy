package com.grupo9.blueticket.models.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
@Data
public class RoleDTO {
	
	@NotEmpty
	private String id;
	
	@NotEmpty
	private String Permission;

}