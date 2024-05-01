package com.runnerz.runnerz.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.runnerz.runnerz.exception.ResourceNotFoundException;
import com.runnerz.runnerz.model.Employee;
import com.runnerz.runnerz.repository.EmployeeRepository;
import com.runnerz.runnerz.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(UUID id) {
        Optional<Employee> e = employeeRepository.findById(id);
        if (e.isPresent())
        return e.get();
        else
        throw new ResourceNotFoundException("Employee", "Id", id);
    }
    
}
