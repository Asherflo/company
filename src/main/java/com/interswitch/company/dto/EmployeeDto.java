package com.interswitch.company.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class EmployeeDto {
    private String name;
    private String phone;
    private String address;
    private LocalDate dob;
    private LocalDate dateJoined;
    private Long employeeCategoryId;
    private Long departmentId;

}
