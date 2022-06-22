package com.northwind.northwind.repositories;

import com.northwind.northwind.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Modifying
    @Query("UPDATE Employee e SET active = 0 WHERE employee_id = ?1")
    void changeActive(int id);
}
