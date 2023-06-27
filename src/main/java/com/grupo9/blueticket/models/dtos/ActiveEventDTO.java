package com.grupo9.blueticket.models.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class ActiveEventDTO {
	@NotEmpty
	private String title;
	private Boolean active;
}
