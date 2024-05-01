package com.runnerz.runnerz.service;

import java.util.List;
import java.util.UUID;

import com.runnerz.runnerz.model.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee emp);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(UUID id);
}
