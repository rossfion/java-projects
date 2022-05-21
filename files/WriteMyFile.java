import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException; 

public class WriteMyFile {
	public static void main (String[] args){
		// 1. Define the path that we want to write to
		String filename = "C:\\Users\\Fionn\\Desktop\\javaprograms\\timshort\\JuniorJavaDeveloper\\javaprojects\\files\\MyFileToWrite.txt";
		
		String message = "I'm writing data that will be placed into a file";
		
		String text = null;
		
		// 2. Create the file in Java
		File file = new File(filename);
		
		
		
		try{
			// 3. Open the file
			FileWriter fw = new FileWriter(file);
			
			// 4. Write to the file
			fw.write(message);
			
			// 5. Close the resources
			fw.close();		
		} catch(IOException e) {
			System.out.println("ERROR! Could not write data to: "+ filename);
			e.printStackTrace();
		} finally {
			System.out.println("Finished writing to the file");
		}
		
	}
}