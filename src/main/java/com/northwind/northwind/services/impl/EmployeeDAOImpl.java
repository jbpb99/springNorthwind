package com.northwind.northwind.services.impl;

import com.northwind.northwind.entities.Employee;
import com.northwind.northwind.repositories.EmployeeRepository;
import com.northwind.northwind.services.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Employee> findAll() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> findById(int id) {
        return (Optional<Employee>) employeeRepository.findById(id);
    }

    @Override
    public Employee deleteById(int id) {
        employeeRepository.deleteById(id);

        return null;
    }

    @Override
    public List<Employee> saveAndFlush(Employee employee) {
        employeeRepository.saveAndFlush(employee);

        return null;
    }

    @Override
    public Optional<Employee> updateEmployee(Employee employee, int id) {
        employeeRepository.saveAndFlush(employee);

        return Optional.empty();
    }
}
