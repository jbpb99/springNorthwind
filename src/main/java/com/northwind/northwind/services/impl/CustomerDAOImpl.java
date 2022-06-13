package com.northwind.northwind.services.impl;

import com.northwind.northwind.entities.Category;
import com.northwind.northwind.entities.Customer;
import com.northwind.northwind.repositories.CustomerRepository;
import com.northwind.northwind.services.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerDAOImpl implements CustomerDAO {
    @Autowired
    private CustomerRepository customerRepository;

    //Get
    @Override
    @Transactional(readOnly = true)
    public List<Customer> findAll() {
        return (List<Customer>) customerRepository.findAll();
    }

    //Get by ID
    @Override
    public Optional<Customer> findById(int id) {
        return (Optional<Customer>) customerRepository.findById(id);
    }


    @Override
    public Category deleteById(int id) {
        customerRepository.deleteById(id);

        return null;
    }

    //Post
    @Override
    public List<Customer> saveAndFlush(Customer customer) {
        customerRepository.saveAndFlush(customer);

        return null;
    }

    //Update
    @Override
    public Customer updateCustomer(Customer customer, int id) {
        customerRepository.saveAndFlush(customer);

        return null;
    }


}
