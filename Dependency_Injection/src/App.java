
public class App {

	public static void main(String[] args) {
		
		Service s1 = new Service("Car Wash");
		Service s2 = new Service("TV Repair");
		Service s3 = new Service("Dry Cleaning");
		
		
		Customer c1 = new Customer(s1);	
		Customer c2 = new Customer(s2);
		Customer c3 = new Customer(s2);
		
		System.out.println("Customer 1 requests: " + c1.viewCustService());
		System.out.println("Customer 2 requests: " + c2.viewCustService());
		System.out.println("Customer 3 requests: " + c3.viewCustService());

	}

}
