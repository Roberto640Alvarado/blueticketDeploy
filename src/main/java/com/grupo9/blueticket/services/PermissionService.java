package com.grupo9.blueticket.services;

import com.grupo9.blueticket.models.dtos.RoleDTO;
import com.grupo9.blueticket.models.entities.Transfer;

public interface PermissionService {
	void save(RoleDTO info) throws Exception;
	Transfer findOneById(String id);

}
