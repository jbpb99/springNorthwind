package com.northwind.northwind.repositories;

import com.northwind.northwind.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaveFlushRepository  extends JpaRepository<Category, Integer> {
}
