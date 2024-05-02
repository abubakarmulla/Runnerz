package com.runnerz.runnerz.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.runnerz.runnerz.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,UUID>{
    // 
    Optional<Employee> findByEmail(String email);
    boolean existsByEmail(String email);
}
