package com.interswitch.company.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
@Setter
@Getter
@Table
@Entity(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Phone")
    private String phone;

    @Column(name = "Address")
    private String address;

    @Column(name = "DateOfBirth")
    private LocalDate dateOfBirth;

    @Column(name = "JoinedDate")
    private LocalDate joinedDate;

    @ManyToOne
    @JoinColumn(name = "EmployeeCategoryId")
    private EmployeeCategory employeeCategory;

    @ManyToOne
    @JoinColumn(name = "DepartmentId")
    private Department department;
}


