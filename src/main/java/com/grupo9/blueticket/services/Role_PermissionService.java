package com.grupo9.blueticket.services;

import java.util.List;
import java.util.UUID;

import com.grupo9.blueticket.models.dtos.SaveRolePermissionDTO;
import com.grupo9.blueticket.models.entities.Role_permission;

public interface Role_PermissionService {
	void save (SaveRolePermissionDTO info) throws Exception;
	void delete(UUID id) throws Exception;
	List<Role_permission>findAll();
}