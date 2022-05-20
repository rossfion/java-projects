public class Cities{
	public static void main(String[] args){
		// declare and define an array's size implicitly
		String[] cities = {"New York", "Baltimore", "Dallas", "London"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		System.out.println("**************");
		
		// declare and define an array's size explicitly
		String[] states = new String[5];
		states[0] = "Maryland";
		states[1] = "California";
		states[2] = "Ohio";
		states[3] = "Florida";
		states[4] = "Minnesota";
		int i = 0;
		// this loop enters the loops then tests the condition
		do{
			System.out.println("STATE: " + states[i]);
			i = i + 1;
		}while (i < 5);
		
		// this loop tests the condition first then enters the loop
		int n = 0;
		boolean stateFound = false;
		while(!stateFound){
			String state = states[n];
			System.out.println(state);
				if (state == "Maryland"){
				System.out.println("STATE FOUND!");
				stateFound = true;
			}
		
			n++;
		
		
	}
		// this has an error - what is it!?!
		System.out.println("\nPrinting with FOR LOOP");
		// for loop is the best structure for iterating through an array ??
		for (int x = 0; x < 5; x++){
			System.out.println(states[x]);
		}
	}
		
}