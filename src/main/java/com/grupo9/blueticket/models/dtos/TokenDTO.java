package com.grupo9.blueticket.models.dtos;

import com.grupo9.blueticket.models.entities.Token;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TokenDTO {
	private String token;

	public TokenDTO(Token token) {
		this.token = token.getContent();
	}
}