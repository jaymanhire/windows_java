
public class Customer {

	private String name;
	private String address;
	private double cashOnHand = 0.0;

	// create constructor
	public Customer(String name, String address, double cashOnHand) {
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address += " Dealership City";
		this.address = address;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		cashOnHand += 500;
		this.cashOnHand = cashOnHand;
	}

	public void purchaseCar(Vehicle vehicle, Employee employees, boolean finance) {
		employees.handleCustomer(this, finance, vehicle);
	}

}
