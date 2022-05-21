import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab3 {
	public static void main(String[] args) {
		// Read a file of password
		String filename = "C:\\Users\\Fionn\\Desktop\\javaprograms\\timshort\\JuniorJavaDeveloper\\javaprojects\\labs\\Passwords.txt";
		String[] passwords = new String[10];
		
		File file = new File(filename);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i=0; i<passwords.length; i++) {
				passwords[i] = br.readLine();
			}
		} catch(FileNotFoundException e) {
			System.out.println("ERROR! File not found: "+ filename);
		} catch(IOException e) {
			System.out.println("ERROR! Could not read data from: " + filename);
		}
		
		// Test against criteria
		for (String password : passwords) {
			System.out.println("******\n" + password + " ");
			
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecialChars = false;
			boolean hasInvalidCharacter = false;
			
			for (int n=0; n < password.length(); n++) {
				// Condition 1: contains a number
				if("0123456789".contains(password.substring(n, n+1))){
					hasNumber = true;
					System.out.println("Position " + n  + " contains a number");
				}
				// Condition 2: contains a letter
				else if ("abcdefghijklmnopqrstuvwxyz".contains(password.substring(n, n+1).toLowerCase())){
					hasLetter = true;
					//System.out.println("Position " + n  + " contains a letter");
					
				} 
				// Condition 3: contains a special character - !@#$ - could include more
				else if ("!@#$".contains(password.substring(n, n+1))) {
					hasSpecialChars = true;
					//System.out.println("Position " + n  + " contains a special character");
				}
				else {
					//hasInvalidCharacter = true;
					//System.out.println("Position " + n  + " contains an invalid character");
					try {
					throw new InvalidCharacterException(password.substring(n, n+1));
					} catch (InvalidCharacterException e){
						e.toString();
						//break;
					}
				}
			
				
			}
			
			// Test and Exception Handling
			try {
				if (!hasNumber) {
				throw new NumberCriteriaException(password);
			} else if(!hasLetter){
				throw new LetterCriteriaException(password);
			} else if(!hasSpecialChars) {
				throw new SpecialCharacterCriteriaException (password);
			} else {
				System.out.println("Valid password");
			}
			} catch (NumberCriteriaException | LetterCriteriaException | SpecialCharacterCriteriaException e){
				System.out.println("Invalid password");
				System.out.println(e.toString());
			}
			
			
		}
		
		
	}
}

class InvalidCharacterException extends Exception {
	String ch;
	public InvalidCharacterException(String ch){
		this.ch = ch;
	}
	
	public String toString(){
		return "InvalidCharacterException: " + ch;
	}
}

class NumberCriteriaException extends Exception {
	String password;
	public NumberCriteriaException(String password){
		this.password = password;
	}
	
	public String toString(){
		return "NumberCriteriaException: " + password;
	}
}

class LetterCriteriaException extends Exception {
	String password;
	public LetterCriteriaException(String password){
		this.password = password;
	}
	
	public String toString(){
		return "LetterCriteriaException: " + password;
	}
}

class SpecialCharacterCriteriaException extends Exception {
	String password;
	public SpecialCharacterCriteriaException(String password){
		this.password = password;
	}
	
public String toString(){
	return "SpecialCharacterCriteriaException: " + password;
}
}