package com.northwind.northwind.services.impl;

import com.northwind.northwind.entities.Category;
import com.northwind.northwind.repositories.CategoryRepository;
import com.northwind.northwind.services.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryDAOImpl implements CategoryDAO {
    @Autowired
    private CategoryRepository categoryRepository;

    //Get
    @Override
    @Transactional(readOnly = true)
    public List<Category> findAll() {
        return (List<Category>) categoryRepository.findAll();
    }
    //Get by ID
    public Optional<Category> findById(int id) {
        return (Optional<Category>) categoryRepository.findById(id);
    }
    //Post
    public List<Category> save(Category category) {
        categoryRepository.save(category);

        return null;
    }

    //Delete
    @Override
    public Category deleteById(int id){
        categoryRepository.deleteById(id);

        return null;
    }


}
