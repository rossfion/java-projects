public class BankAccountApp {
	public static void main(String[] args){
		// Creating a new bank account
		
		BankAccount acc1 = new BankAccount();
		
		// old way
		//acc1.name = "Roger McHugh";
		
		// new way - with encapsulation : public API methods
		acc1.setName("Roger McHugh");
		System.out.println(acc1.getName());
		acc1.setSSN("123012345");
		System.out.println("SSN: " + acc1.getSSN());
		
		acc1.accountNumber = "123234456";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		System.out.println();
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "098678765";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "456987609";
		acc3.checkBalance();
		
		/* System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		System.out.println(acc3.routingNumber); */
	}
}