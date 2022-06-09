package com.northwind.northwind.repositories;

import com.northwind.northwind.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {

}
