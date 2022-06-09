package com.northwind.northwind.repositories;

import com.northwind.northwind.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
}
