public class Strings{
	public static void main(String[] args){
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of The Rings";
		
		if(bookTitle.contains(wordChoice)){
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		//if(browser == "chrome"){
			if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Fionn";
		String lastName = "Short";
		String SSN = "984162168";
		
		// print the initials plus the last 4 digits of the SSN
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.print(SSN.substring(5));
	}
}