package com.northwind.northwind.services.impl;

import com.northwind.northwind.entities.Order;
import com.northwind.northwind.repositories.OrderRepository;
import com.northwind.northwind.services.OrderDAO;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class OrderDAOImpl implements OrderDAO {
    @Autowired
    private OrderRepository orderRepository;

    //Get
    @Transactional(readOnly = true)
    @Override
    public List<Order> findAll() {
       return (List<Order>) orderRepository.findAll();

    }

    //Get By Id
    @Override
    public Optional<Order> findById(int id) {
        return (Optional<Order>) orderRepository.findById(id);
    }

    @Override
    public List<Order> saveAndFlush(Order order) {
        orderRepository.saveAndFlush(order);

        return null;
    }

    //Delete
    @Override
    public void deleteById(int id) {
        orderRepository.deleteById(id);

    }

    //Update
    @Override
    public Optional<Order> updateOrder(Order order, int id) {
        Optional<Order> orders = orderRepository.findById(id);
        Order orderObj;

        if(orders.isPresent()) {
            orderObj = orders.get();

            orderObj.setOrderDate(order.getOrderDate());

            orderRepository.saveAndFlush(orderObj);

            return Optional.of(orderObj);
        }

        return Optional.empty();
    }
}
