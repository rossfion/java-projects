import java.util.ArrayList;
import java.util.List;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
	public static void main(String[] args){
		
		//This method will read data from a CSV file
		List<String[]> data = new ArrayList<String[]>();
		String filename = "C:\\Users\\Fionn\\Desktop\\javaprograms\\timshort\\JuniorJavaDeveloper\\javaprojects\\datastructures\\accounts.csv";
		String dataRow;
		
		try {
			// Open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			// Read the data as long as it is not empty
			while((dataRow = br.readLine()) != null){
				// Parse the data by commas
				String[] line = dataRow.split(",");
				// Add the data to the collection
				data.add(line);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(String[] account : data){
			System.out.print("[ ");
			for(String field : account){
				System.out.print(field + "   " );
			}
			System.out.println(" ]");
		}
	}

}