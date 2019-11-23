package domain;

import java.util.Date;

public class Employee {

	private String name;
	private Date hireDate;
	private int salary;
	private boolean working;
	public int employeeID;

	private static int COUNTER = 1;

	public Employee(String name, Date hireDate, int salary, boolean working) {
		this.name = name;
		this.hireDate = hireDate;
		this.salary = salary;
		this.working = working;

		employeeID = COUNTER++;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return hireDate;
	}

	public void setDate(Date date) {
		this.hireDate = date;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", hireDate=" + hireDate + ", salary=" + salary + ", working=" + working
				+ ", employeeID=" + employeeID + "]";
	}

}
