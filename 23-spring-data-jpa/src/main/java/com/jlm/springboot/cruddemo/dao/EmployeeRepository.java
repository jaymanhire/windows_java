package com.jlm.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlm.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// no need for an Impl class

}
