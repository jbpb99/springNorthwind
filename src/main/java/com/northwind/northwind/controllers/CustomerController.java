package com.northwind.northwind.controllers;

import com.northwind.northwind.entities.Category;
import com.northwind.northwind.entities.Customer;
import com.northwind.northwind.services.CategoryDAO;
import com.northwind.northwind.services.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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

    //Post
    @PostMapping
    @RequestMapping("/post")
    public Customer saveCustomer(@RequestBody Customer customerBody) {
        customerDAO.saveAndFlush(customerBody);

        return customerBody;
    }

    //Delete
    @RequestMapping("/delete/{id}")
    public Customer deleteCustomer(@PathVariable int id) {
        customerDAO.deleteById(id);

        return null;
    }

    //Update
    @PutMapping
    @RequestMapping("/update/{id}")
    public Customer updateCustomer(@RequestBody Customer customerBody, @PathVariable int id) {
        customerDAO.saveAndFlush(customerBody);

        return customerBody;
    }


}
