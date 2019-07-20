package com.jlm.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlm.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// no need for an Impl class
	
	// amethod to sort by last name, or...
	// JPA will parse the method name, create the query for you
	// 'findAllBy', then etc..
	public List<Employee> findAllByOrderByLastNameAsc();

}
