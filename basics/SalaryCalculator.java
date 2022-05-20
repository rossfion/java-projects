public class SalaryCalculator {

    public static void main(String[] args) {

        // Create a variable to dfine orur career
		
		// Declare a varaible
		String career;
		System.out.println("Program is starting...");
		
		//Define a variable
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		// Define and declare
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
		
		// Compute our annual salary
		// rate * hoursPerWeek * weeksPerYear

        
	}
}