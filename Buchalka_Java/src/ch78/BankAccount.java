package ch78;

import java.text.NumberFormat;

public class BankAccount {

	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private long phoneNumber;

	public BankAccount(String accountNumber, double balance, String customerName, String email, long phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	NumberFormat currency = NumberFormat.getCurrencyInstance();

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double deposit(double deposit) {
		if (deposit > 0.0) {
			balance += deposit;
		}
		return balance;

	}

	public double withdrawl(double withdrawl) {
		if (withdrawl > 0.0 && withdrawl < balance) {
			balance -= withdrawl;
		}
		return balance;

	}

	@Override
	public String toString() {
		return customerName +" - BankAccount Overview: \naccountNumber=" + accountNumber + ", balance=" + currency.format(balance) + ", customerName=" + customerName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber;
	}
	

}
