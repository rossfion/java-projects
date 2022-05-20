public class AccountApp{
public static void main(String[] args){
	LoanAccount la = new LoanAccount();
	la.increaseRate();
	la.setRate();
	la.setAmortSchedule();
	la.setTerm(20);
	
	// This is polymorphism because it changes where we are pointing - in this case, to the LoanAccount
	IRate account1 = new LoanAccount();
	account1.increaseRate();
	account1.setRate();
	
}
}