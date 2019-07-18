package com.jlm.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jlm.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	// define field for entity Manager
	private EntityManager entityManager;

	// set up constructor injection
	@Autowired
	public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	//@Transactional  // going to create a service to handle this
	public List<Employee> findAll() {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// create a query
		Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);

		// exec query and get the result list
		List<Employee> employees = theQuery.getResultList();

		// retur the results
		return employees;

	}

	@Override
	public Employee findById(int theId) {
		
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// get the desired employee
		Employee employee = currentSession.get(Employee.class, theId);
		
		// return the employee 
		return employee; 
	}

	@Override
	public void save(Employee theEmployee) {
		
		Session currrentSession = entityManager.unwrap(Session.class);
		
		// save the employee //if id=0 it will save(insert), else it updates
		currrentSession.saveOrUpdate(theEmployee);
		
		
	}

	@Override
	public void deleteById(int theId) {

		Session currentSession = entityManager.unwrap(Session.class);

		// delete the employee using the primary key of id
		// id=:employeeId... is the patrameter based on the method param coming in
		Query<?> theQuery = currentSession.createQuery("delete from Employee where id=:employeeId");

		theQuery.setParameter("employeeId", theId);

		theQuery.executeUpdate();

	}

}
