package com.runnerz.runnerz.controller;

import org.springframework.web.bind.annotation.RestController;

import com.runnerz.runnerz.model.Employee;
import com.runnerz.runnerz.service.EmployeeService;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String home(){
        return "Runnerz Home Page!";
    }

    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> addEmp(@RequestBody Employee emp){
        return new ResponseEntity<Employee>(employeeService.saveEmployee(emp), HttpStatus.CREATED);
    }
    
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmp(){
        return new ResponseEntity<List<Employee>>(employeeService.getAllEmployees(), HttpStatus.valueOf(200));
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmpById(@PathVariable("id") UUID emp_id){
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(emp_id),HttpStatus.valueOf(200));
    }

    @PutMapping("/updateEmployee/{id}")
    public ResponseEntity<Employee> updateEmpById(@PathVariable("id") UUID emp_id, @RequestBody Employee emp){
        return new ResponseEntity<Employee>(employeeService.updatEmployeeById(emp, emp_id),HttpStatus.OK);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<String> deleteEmpById(@PathVariable("id") UUID emp_id){
        return new ResponseEntity<String>(employeeService.deleteEmployee(emp_id),HttpStatus.OK);
    }
}
