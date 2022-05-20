public class BankAccountApp {
	public static void main(String[] args){
		BankAccount acc1 = new BankAccount("987245678", 1000);
		BankAccount acc2 = new BankAccount("997245679", 1500);
		BankAccount acc3 = new BankAccount("986245677", 2000);
		
		acc1.setName("Scotty");
		System.out.println(acc1.getName());
		
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
		
	}
}

class BankAccount implements IInterest{
	// properties of bank account
	// the client will not have access to these variables except through the methods we provide them
	private static int ID = 1000; // Internal ID
	private String accountNumber; // ID + Random 2-digit number + first 2 of SSN
	private static final String routingNumber = "135429";
	private String name;
	private String SSN;
	private double balance;
	
	// Constructor
	public BankAccount(String SSN, double initDeposit){
		//System.out.println("New acount created");
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		//System.out.println(ID);
		setAccountNumber();
	}
	
	private void setAccountNumber(){
		int random = (int) (Math.random() * 100);
		//System.out.println(random);
		accountNumber = ID + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account Number: " + accountNumber);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void payBill(double amount){
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount){
		balance = balance + amount;
		System.out.println("Making deposit: " + amount);
		showBalance();
	}
	
	public void showBalance(){
		System.out.println("Balance: " + balance);
	}
	
	@Override
	public void accrue(){
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString(){
		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
	}
	
}