package com.grupo9.blueticket.models.dtos;

import com.grupo9.blueticket.models.dtos.PasswordDTO;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class PasswordDTO {
	@NotEmpty(message = "The old password is required!")
	private String oldPassword;
	@NotEmpty(message = "The new Password is required!")
	private String newPassword;

}
