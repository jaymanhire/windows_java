package queue;

import java.util.LinkedList;

public class Store {

	public static void main(String[] args) {
		
		LinkedList<Customer> queue = new LinkedList<Customer>();
		queue.add(new Customer("Sally"));
		queue.add(new Customer("Ben"));
		queue.add(new Customer("Emma"));
		queue.add(new Customer("Fred"));
		System.out.println(queue);
		
		serveCustomer(queue);
		//System.out.println(queue);
		

	}
	
	static void serveCustomer(LinkedList<Customer> queue) {
//		Customer c = queue.poll();
//		c.serve();
//		Customer d = queue.poll();
//		d.serve();
		for (Customer customers : queue) {
			customers.serve();
		}
		System.out.println(queue);

	}

}
