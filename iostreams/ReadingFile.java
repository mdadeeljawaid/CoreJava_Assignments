package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) {
		
		//Create a File path object
		File file = new File("C:\\Users\\Adeel\\Desktop\\Employee.txt");
		
		
		FileInputStream fileInputStream = null;
		
		try {
			 //instantiate FileInputStream for reading text file
			 fileInputStream = new FileInputStream(file);
			 
			 //read first character
			 int ch = fileInputStream.read();
			 
			 
			 //loop to read a character repeatedly
			 while(ch != -1) {					//check for EOF
				 //System.out.println("Entered in loop");
				 System.out.print((char)ch);	//display the character
				 ch = fileInputStream.read();	//read next character
			 }
			 
			 fileInputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}