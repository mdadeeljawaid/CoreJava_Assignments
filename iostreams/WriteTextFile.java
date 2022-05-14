package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) {
		//Create a File path object
		File file = new File("C:\\Users\\Adeel\\Desktop\\Employee.txt");
		String text ="Constructor is a special method in a class. It has following features:"
				+ "\n1. Name of the Constructor is same as that of class name"
				+ "\n2. A Constructor can not have a return type"
				+ "\n3. A class can have multiple Constructors";
		
		FileOutputStream fileOutputStream = null;
		
		try {
			//instantiate FileOutputStream
			fileOutputStream = new FileOutputStream(file);
			
			//obtain the byte array to write, from the String
			byte[] b= text.getBytes();
			
			//write the byte array
			fileOutputStream.write(b);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}