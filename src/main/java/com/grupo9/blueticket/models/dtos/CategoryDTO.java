package com.grupo9.blueticket.models.dtos;

import java.util.UUID;

public class CategoryDTO {
    private UUID id;
    private String name;
    private String description;

    // Constructores

    public CategoryDTO() {
    }

    public CategoryDTO(UUID id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Getters y Setters

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
