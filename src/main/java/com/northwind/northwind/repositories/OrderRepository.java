package com.northwind.northwind.repositories;

import com.northwind.northwind.entities.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, String> {
}
