package com.runnerz.runnerz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.runnerz.runnerz.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    // 
}
