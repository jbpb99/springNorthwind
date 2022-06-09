package com.northwind.northwind.repositories;

import com.northwind.northwind.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, String> {

}
