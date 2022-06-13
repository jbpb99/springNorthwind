package com.northwind.northwind.controllers;

import com.northwind.northwind.entities.Category;
import com.northwind.northwind.services.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias/")
public class CategoryController {
    private final CategoryDAO categoryDAO;

    @Autowired
    public CategoryController(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    //Get categories
    @GetMapping
    @RequestMapping("/get")
    public List<Category> getCategories() {
        List<Category> categories;

        categories = categoryDAO.findAll();

        return categories;
    }

    //Get by ID
    @GetMapping("/get/{id}")
    public Category getCatById(@PathVariable int id) {
        Optional<Category> categories;
        Category category;

        categories = categoryDAO.findById(id);

        if(categories.isPresent()) {
            category = categories.get();

            return category;
        }

        return null;
    }

    //Post
    @PostMapping
    @RequestMapping("/post")
    public Category saveCategory(@RequestBody Category categoryBody) {
        categoryDAO.saveAndFlush(categoryBody);

        return categoryBody;
    }

    //Delete
    @RequestMapping("/delete/{id}")
    public Category deleteCategory(@PathVariable int id) {
        categoryDAO.deleteById(id);

        return null;
    }
}
