
public class Employee {

	public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {

		if (finance == true) {
			double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
			runCreditHistory(customer, loanAmount);

		} else if (vehicle.getPrice() <= customer.getCashOnHand()) {
			// customer pays in cash
			processTransaction(customer, vehicle);
		} else {
			System.out.println("Customer will need more money to make the purchase vehicle: " + vehicle);
		}
	}

	private void runCreditHistory(Customer customer, double loanAmount) {
		System.out.println("Ran credit history for customer...");
		System.out.println("Customer has been approved to purchase the vehicle.");
	}

	private void processTransaction(Customer customer, Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle: " + vehicle);
	}
	

}
