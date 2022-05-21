import java.util.ArrayList;

public class AboutLists {
	public static void main(String[] args){
		// 1. Create a collection
		ArrayList<String> cities = new ArrayList<String>();
		
		
		// 2. Add some elements
		cities.add("Baltimore");
		cities.add("Washington, DC");
		cities.add("New York");
		cities.add("Philadelphia");
		cities.add("Miami");
		
		// 3. Iterate through the collection
		for(String city : cities){
			System.out.println(city);
		}
		
		// 4. Get the size
		int size = cities.size();
		System.out.println("There are " + size + " elements in the cillection");
		
		// 5. Retrieve a specific element
		System.out.println(cities.get(3));
		
		// 6. Remove a specific element
		cities.remove(4);
		size = cities.size();
		System.out.println("Now, there are " + size + " elements in the cillection");
		for(String city : cities){
			System.out.println(city);
		}
	}
}