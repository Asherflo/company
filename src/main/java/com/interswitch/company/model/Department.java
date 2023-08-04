package com.interswitch.company.model;

import jakarta.persistence.*;

@Table
@Entity(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Description")
    private String description;
    @Column(name = "ManagerId")
    private  int managerId;
}
