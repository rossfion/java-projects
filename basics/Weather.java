public class Weather {

    public static void main(String[] args) {

		// This program will give suggestions as to what to wear depending on the weather. (temperature and sun condition
		
		//int temperature = 65;
		//String sunCondition = "Sunny";
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if(temperature > 80){
			System.out.println("It's pleasant. Wear shorts and a t-shirt");
		} else if((temperature > 60) && (sunCondition == "Sunny")){
			System.out.println("It's a litttle cooler. Perhaps wear long sleeve shirt and jeans");
			System.out.println("Wear a hat to block the sun.");
			
		} else if ((temperature > 50) && (sunCondition == "Overcast")){
			System.out.println("This is a cooler day. Wear something warm.");
		
		} else {
			System.out.println("Looks like a cold day. Bring a sweater.");
		}
        
			System.out.println("The program is ending.");
	}
}
