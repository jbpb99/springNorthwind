package com.northwind.northwind.repositories;

import com.northwind.northwind.entities.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository extends CrudRepository<Supplier, String> {
}
