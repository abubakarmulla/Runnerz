package com.runnerz.runnerz.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.runnerz.runnerz.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,UUID>{
    // 
}
