package com.northwind.northwind.services;

import com.northwind.northwind.entities.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryDAO {
    //Get
    List<Category> findAll();
    //Get by ID
    Optional<Category> findById(int id);

    //Post
    List<Category> save(Category category);

    //Delete
    Category deleteById(int id);
}
