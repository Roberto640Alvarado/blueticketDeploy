package com.grupo9.blueticket.services;

import java.util.List;

import com.grupo9.blueticket.models.dtos.LocalityDTO;
import com.grupo9.blueticket.models.entities.Locality;

public interface LocalityService {
	void save(LocalityDTO info) throws Exception;
	void delete(String id) throws Exception;
	List<Locality>findAll();
}
