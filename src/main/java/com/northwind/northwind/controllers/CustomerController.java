package com.northwind.northwind.controllers;

import com.northwind.northwind.entities.Category;
import com.northwind.northwind.entities.Customer;
import com.northwind.northwind.services.CategoryDAO;
import com.northwind.northwind.services.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers/")
public class CustomerController {
    private final CustomerDAO customerDAO;

    @Autowired
    public CustomerController(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    //Get
    @GetMapping
    @RequestMapping("/get")
    public List<Customer> getCustomers() {
        List<Customer> customers;

        customers = customerDAO.findAll();
        return customers;
    }

    //GetbyID
    @RequestMapping("/get/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        Optional<Customer> customers;
        Customer customer;

        customers = customerDAO.findById(id);

        if(customers.isPresent()) {
            customer = customers.get();

            return customer;
        }
        return null;
    }


}
