package com.jlm.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jlm.springboot.cruddemo.entity.Employee;

//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// no need for an Impl class

}
