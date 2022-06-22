package com.northwind.northwind.repositories;

import com.northwind.northwind.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    @Modifying
    @Query("UPDATE Customer c SET active = 0 WHERE customer_id = ?1")
    void changeActive(int id);

}
