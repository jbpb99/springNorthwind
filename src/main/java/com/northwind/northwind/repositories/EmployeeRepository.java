package com.northwind.northwind.repositories;

import com.northwind.northwind.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
}
