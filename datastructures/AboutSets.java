import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AboutSets {
	public static void main(String[] args){
		
		// 1. Define the collection
		// HashSet<String> animals = new HashSet<String>(); // random order
		
		// Making use of polymorphism
		// Set<String> animals = new HashSet<String>();
		
		// Using LinkedHashSet - retains order
		// Set<String> animals = new LinkedHashSet<String>();
		
		// Using TreeSet - arranged in alphabetical order
		Set<String> animals = new TreeSet<String>();
		
		// 2. Add elements
		animals.add("dog");
		animals.add("pig");
		animals.add("hog");
		animals.add("cat");
		animals.add("snake");
		
		System.out.println(animals.size() + " " + animals);
		
		animals.add("cat");
		animals.add("snake");
		animals.add("goose");
		System.out.println(animals.size() + " " + animals);
		
		// Create a new set for comparison 
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("chicken");
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("horse");
		farmAnimals.add("dog");
		
		// What is the intersection between animals and farmAnimals?
		// 1. Copy existing set into a new set
		Set<String> intersectionSet = new HashSet<String>(animals);
		System.out.println(intersectionSet);
		// 2. Retain only the elements that are in the other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The intersection is: " + intersectionSet);
		
		// What is the union?
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union is: " + unionSet);
		
		// What is the difference? in animals but NOT farmAnimals
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The difference is: " + differenceSet);
		
	}
}