package com.grupo9.blueticket.repositories;

import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;

import com.grupo9.blueticket.models.entities.User;

public interface UserRepository extends ListCrudRepository<User, UUID>{
	public User findOneByUsernameOrEmail(String username, String email);

}
