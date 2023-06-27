package com.grupo9.blueticket.models.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LocalityDTO {
	@NotEmpty
	private String name;
	@NotEmpty
	private int capacity;
	@NotEmpty
	private Float price;
}
