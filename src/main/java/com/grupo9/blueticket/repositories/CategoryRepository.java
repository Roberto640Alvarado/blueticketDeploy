package com.grupo9.blueticket.repositories;

import org.springframework.data.repository.ListCrudRepository;

import com.grupo9.blueticket.models.entities.Category;


public interface CategoryRepository extends ListCrudRepository<Category, Integer> {

}