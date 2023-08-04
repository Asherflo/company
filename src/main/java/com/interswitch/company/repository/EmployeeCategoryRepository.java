package com.interswitch.company.repository;

import com.interswitch.company.model.EmployeeCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCategoryRepository extends JpaRepository<EmployeeCategory,Long> {
}
