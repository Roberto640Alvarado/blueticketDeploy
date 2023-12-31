package com.grupo9.blueticket.models.dtos;

import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class ActiveDTO {
	
	@Email
	private String email;
	private Boolean active;
}
