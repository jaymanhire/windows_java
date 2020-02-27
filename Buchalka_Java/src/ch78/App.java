package ch78;

public class App {

	public static void main(String[] args) {

		BankAccount jay = new BankAccount("9461", 0.00, "Jay Manhire", "jm@gmail.com", 2483859545L);

		jay.deposit(1500.00);
		//System.out.println("Jay's balance: " + jay.getBalance());

		jay.withdrawl(256.36);
		System.out.println(jay.toString());

		System.out.println(jay.toString());
		
		jay.deposit(1500.00);

		System.out.println(jay.toString());
		
		

	}

}
