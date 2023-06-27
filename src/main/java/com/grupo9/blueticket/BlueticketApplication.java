package com.grupo9.blueticket;

import java.security.SecureRandom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class BlueticketApplication {
	
	@Bean
	public PasswordEncoder passwordEncoder(){
	    return new BCryptPasswordEncoder(10, new SecureRandom()); // Para saltos

	}


	public static void main(String[] args) {
		SpringApplication.run(BlueticketApplication.class, args);
	}

}
