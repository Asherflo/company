package com.interswitch.company.service;

import com.interswitch.company.dto.EmployeeDto;
import com.interswitch.company.model.Employee;

public interface EmployeeService {
    Employee createEmployee(EmployeeDto employeeDto);
}
