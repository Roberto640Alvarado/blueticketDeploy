package com.grupo9.blueticket.services;

import java.util.List;

import com.grupo9.blueticket.models.entities.Category;

public interface CategoryService {

	List<Category> findAll();
	Category findOneById(int id);
}