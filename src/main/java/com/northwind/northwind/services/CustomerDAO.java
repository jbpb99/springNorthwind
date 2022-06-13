package com.northwind.northwind.services;

import com.northwind.northwind.entities.Category;
import com.northwind.northwind.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDAO {
    //Get
    List<Customer> findAll();
    //Get by ID
    Optional<Customer> findById(int id);

    //Post
    //List<Category> save(Category category);

    //Delete
    Category deleteById(int id);

    //New post
    List<Customer> saveAndFlush(Category category);
}
