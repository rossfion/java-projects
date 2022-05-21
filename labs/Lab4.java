import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab4 {
	public static void main(String[] args){
		
		// This method will read data from a CSV file
		List<String[]> transactions = new ArrayList<String[]>();
		String filename = "C:\\Users\\Fionn\\Desktop\\javaprograms\\timshort\\JuniorJavaDeveloper\\javaprojects\\labs\\CCStatement.csv";
		String dataRow;
		double balance = 0;
		
		try {
			// Open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			// Read the data as long as it is not empty
			while((dataRow = br.readLine()) != null){
				// Parse the data by commas
				String[] line = dataRow.split(",");
				// Add the data to the collection
				transactions.add(line);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(String[] transaction : transactions){
			String date = transaction[0];
			String type = transaction[1];
			String vendor = transaction[2];
			double amount = Double.parseDouble(transaction[3]);
			System.out.print(date + " " + type + " " + vendor + " $" + amount);
			/* System.out.print("[ ");
			for(String field : transaction){
				System.out.print(field + "   " );
			}
			System.out.println(" ]"); */
			
			if(type.equalsIgnoreCase("credit")) {
				//System.out.println("Add to balance");
				balance = balance + amount;
			} else if(type.equalsIgnoreCase("debit")) {
				//System.out.println("Subtract from balance");
				balance = balance - amount;
			}
			 else {
				 //System.out.println("Some other transaction");
			 }
			 System.out.println(" " + balance);
		}
		// Check the balance
		if(balance > 0){
			System.out.println("You have a balance of " + balance);
			System.out.println("You are being charged a 10% fee of " + balance * .10);
			System.out.println("Your new balance is: " + balance * 1.1);
		} else if (balance < 0){
			System.out.println("Thank you for your payments.");
			System.out.println("You have an overpayment of -" + balance);
		} else {
			System.out.println("Thank you for your payments!");
		}
	}

}