public class BankAccount implements IRate{
	// Define variables
	String accountNumber;
	
	// Static belongs to the class not the object instance
	// final is a constant - often goes with static
	private static final String routingNumber = "013567";
	
	// instance variables
	private String name; // data hiding (encapsulation)
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions: unique methods
	// 1. they are used to define /set/initialize properties of an object
	// 2. they are implicitly called upon instantiation
	// 3. the same name as the class itself
	// 4. Constructors have no return type
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	// Overloading: call same method with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accountType and Msg are local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if(initDeposit < 1000){
			Msg = "ERROR: Minimum deposit must be at least 5000";
		} else {
			Msg = "Thank you for your initial deposit of: $ " + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	// Getters and setters 
	
	// Allow the user to define the name
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSSN(String ssn){
		this.ssn = ssn;
	}
	
	public String getSSN(){
		return ssn;
	}
	
	// Interface methods
	public void setRate(){
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate(){
		System.out.println("INCREASING RATE");
	}
	
	
	// Define methods
	
	void deposit(double amount){
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount){
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	
	// private can only be called from within the class
	private void showActivity(String activity){
		System.out.println("Showing recent activity");
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	void checkBalance(){
		System.out.println("Balance: " + balance);
	}
	
	void getStatus(){
		
	}
	
	@Override
	public String toString(){
		return "[" + name + ", " + accountNumber + ". BALANCE: $" + balance + "]";
	}
}