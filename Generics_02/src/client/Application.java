package client;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		Object myObject = new Object();		
		String myVar = "Hello";		
		myObject = myVar;
		
		Employee emp = new Employee();
		Accountant acc = new Accountant();		
		emp = acc; 
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee());
     	ArrayList<Accountant> accountants = new ArrayList<Accountant>();
     	accountants.add(new Accountant());
//		employees = accountants;
		
		ArrayList<?> employees2 = new ArrayList<>();
		ArrayList<String> accountants2 = new ArrayList<>();
		employees2 = accountants2;
		
		//upper bound
		ArrayList<? extends Employee> employees3 = new ArrayList<>(); //  highest type is Employee, inclusive of the Employee type
		ArrayList<Employee> accountants3 = new ArrayList<>();
		employees3 = accountants3;
		
		// Lower Bound, only Employee(s) or their parents
		ArrayList<? super Employee> employees4 = new ArrayList<>();// Prevents sub-classes from entering the List
		ArrayList<Employee> accountants4 = new ArrayList<>();
		employees4 = accountants4;

		// Lower Bound, only Employee(s) or their parents
		ArrayList<? super Employee> employees5 = new ArrayList<>();// Prevents sub-classes from entering the List
		ArrayList<Object> accountants5 = new ArrayList<>();
		employees5 = accountants5;
		
		makeEmployeeWork(accountants);

	}
	
	public static void makeEmployeeWork(List<? extends Employee> employees) {
		for(Employee emp : employees) {
			emp.work();
			
		}
	}
	
	public static void makeEmployeeWork2(List<? extends Employee> employees) {
		for(Accountant emp :(ArrayList<Accountant>) employees) {
			emp.work();
			
		}
	}
	
	

}
