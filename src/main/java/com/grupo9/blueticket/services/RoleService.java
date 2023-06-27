package com.grupo9.blueticket.services;

import java.util.List;

import com.grupo9.blueticket.models.dtos.RoleDTO;
import com.grupo9.blueticket.models.entities.Role;

public interface RoleService {

	void save(RoleDTO info) throws Exception;
	void delete(String id) throws Exception;
	List<Role> findAll();
}
