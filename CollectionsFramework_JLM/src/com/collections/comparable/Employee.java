package com.collections.comparable;

import java.text.NumberFormat;

public class Employee implements Comparable<Employee> {

	private String name;
	private int salary;
	private String department;

	public Employee(String name, int salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		return "Employee Name: " + name + "\nSalary: " + fmt.format(salary) + "\nDepartment: " + department + "\n";
	}

	@Override
	public int compareTo(Employee o) {
		if (this.salary < o.salary) {
			return -1;
		} else if (this.salary > o.salary) {
			return 1;
		} else
			return 0;
	}

}
