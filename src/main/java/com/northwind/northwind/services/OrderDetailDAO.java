package com.northwind.northwind.services;

import com.northwind.northwind.entities.OrderDetail;
import com.northwind.northwind.repositories.OrderDetailRepository;

import java.util.List;
import java.util.Optional;

public interface OrderDetailDAO {
    List<OrderDetail> findAll();

    Optional <OrderDetail> findById(int id);

    void deleteById(int id);

    List<OrderDetail> saveAndFlush(OrderDetail orderDetail);

    Optional<OrderDetail> updateOrderDetail(OrderDetail orderDetail, int id);
}
