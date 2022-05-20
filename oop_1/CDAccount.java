// Classes can have multiple interfaces but only one extension
public class CDAccount extends BankAccount implements IRate{
	String interestRate;
	
	void compound(){
		System.out.println("Compounding interest");
	}
}