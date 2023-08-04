package com.interswitch.company.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Table
@Entity(name = "salaryRate")
public class SalaryRate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private long id;
    @Column(name = "EmployeeCategoryId")
private EmployeeCategory employeeCategory;
    @Column(name = "Level")
private int level;
    @Column(name = "Amount")
private double amount;
}
