import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {
	public static void main(String[] args){
		// This will read a text file and retrieve a phone number
		String filename = "C:\\Users\\Fionn\\Desktop\\javaprograms\\timshort\\JuniorJavaDeveloper\\javaprojects\\labs\\PhoneNumber.txt";
		File file = new File(filename);
		String phoneNum = null;
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			phoneNum = br.readLine();
		} catch (FileNotFoundException e){
			System.out.println("ERROR! File not found: "+ filename);
		} catch (IOException e) {
			System.out.println("ERROR! Could not read data from: " + filename);
		}
		// Valid phone number is 10 digits long; area code cannot start with 0 or 9; there cannot be a 911 in the number
		try{
			if(phoneNum.length() != 10) {
				throw new TenDigitsException(phoneNum);
			}
			if(phoneNum.substring(0, 1).equals("0") || phoneNum.substring(0, 1).equals("9")){
				throw new AreaCodeException(phoneNum);
			}
			for (int n=0; n<phoneNum.length()-2; n++) {
				if(phoneNum.substring(n, (n+1)).equals("9")){
					if(phoneNum.substring(n+1, n+3).equals("11")){
						throw new EmergencyNumberException(phoneNum);
					}
				}
			}
			System.out.println(phoneNum);
		} catch(TenDigitsException e){
			System.out.println("ERROR: Phone number is not 10 digits");
			System.out.println(e.toString());
		} catch (AreaCodeException e) {
			System.out.println("ERROR: Phone number has invalid area code");
			System.out.println(e.toString());
		} catch (EmergencyNumberException e) {
			System.out.println("ERROR: Invalid 911 sequence");
			System.out.println(e.toString());
		}
	}
}
class TenDigitsException extends Exception {
	String num;
	TenDigitsException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("TenDigitsException: " + num);
	}
}

class AreaCodeException extends Exception {
	String num;
	AreaCodeException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("AreaCodeException: " + num);
	}
}

class EmergencyNumberException extends Exception {
	String num;
	EmergencyNumberException(String num) {
		this.num = num;
	}
	public String toString() {
		return ("EmergencyNumberException: " + num);
	}
}