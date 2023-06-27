package com.grupo9.blueticket.services;

import java.util.List;
import java.util.UUID;

import com.grupo9.blueticket.models.dtos.SaleDTO;
import com.grupo9.blueticket.models.entities.Sale;

public interface SaleService {
	
	Sale findOneById(UUID id);
    List<Sale> findAll();
    void save(SaleDTO info) throws Exception;
    void changeActive(Boolean isActive);
    void Search(UUID id);

}