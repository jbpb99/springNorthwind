package com.northwind.northwind.repositories;

import com.northwind.northwind.entities.OrderDetail;
import org.springframework.data.repository.CrudRepository;

public interface OrderDetailRepository extends CrudRepository<OrderDetail, String> {
}
