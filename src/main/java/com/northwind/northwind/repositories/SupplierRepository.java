package com.northwind.northwind.repositories;

import com.northwind.northwind.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
