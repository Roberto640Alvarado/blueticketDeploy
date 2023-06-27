package com.grupo9.blueticket.services;

import java.util.List;
import java.util.UUID;

import com.grupo9.blueticket.models.entities.Transfer;

public interface TransferService {
	
	Transfer findOneById(UUID id);
	List<Transfer> findAll();

}
