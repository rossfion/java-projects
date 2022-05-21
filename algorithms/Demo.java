public class Demo {
	
	public static void main(String[] args){
		
		// Define array
		int[] numbers = {10, 25, 433, 26, 73, 132, 5};
		int[] sortedNumbers = {5,9,12,18,21,26,29,35,39,45,49,51,58,59,61,72,99,91,94};
		
		// Call the linear search that searches for a specific number
		int position = Search.linearSearch(numbers, 73);
		System.out.println("Found at position: " + position);
		
		// Call the binary search
		int index = Search.binarySearch(sortedNumbers, 9, 0, sortedNumbers.length);
		System.out.println("Found at position: " + index);
		
		// Call the bubblesort function
		Sort.bubbleSort(numbers);
		
	}

}