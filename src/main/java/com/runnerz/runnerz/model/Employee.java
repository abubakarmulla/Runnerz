package com.runnerz.runnerz.model;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

// import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {
    // @Id
    // @GeneratedValue(strategy = GenerationType.UUID)
    // @Column(name = "emp_id")
    // private UUID id;

    @Id
    // @GeneratedValue(strategy = GenerationType.UUID)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "emp_id",columnDefinition = "VARCHAR(100)")
    private UUID id;

    @Column(name = "fname")
    private String firstName;

    @Column(name = "lname")
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;
}
