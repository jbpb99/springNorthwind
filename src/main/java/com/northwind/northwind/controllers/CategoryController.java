package com.northwind.northwind.controllers;

import com.northwind.northwind.dto.CategoryDto;
import com.northwind.northwind.entities.Category;
import com.northwind.northwind.mapstruct.mappers.CategoryMapper;
import com.northwind.northwind.services.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories/")
public class CategoryController {
    //DAO
    private final CategoryDAO categoryDAO;

    //Mapper for structured data
    private CategoryMapper categoryMapper;

    @Autowired
    public CategoryController(CategoryDAO categoryDAO, CategoryMapper categoryMapper) {
        this.categoryDAO = categoryDAO;
        this.categoryMapper = categoryMapper;
    }

    //Get categories
    @GetMapping
    @RequestMapping("/get")
    public List<CategoryDto> getCategories() {
        List<Category> categories;
        List<CategoryDto> categoryDtos = new ArrayList<>();

        categories = categoryDAO.findAll();
        categories.forEach(category -> {
            categoryDtos.add(categoryMapper.categoryDto(category));
        });



        //categories = categoryDAO.findAll();
        return categoryDtos;
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

    //Update
    @PutMapping
    @RequestMapping("/update/{id}")
    public Category updateCategory(@RequestBody Category categoryBody, @PathVariable int id) {
        categoryDAO.saveAndFlush(categoryBody);
        return categoryBody;
    }
}
