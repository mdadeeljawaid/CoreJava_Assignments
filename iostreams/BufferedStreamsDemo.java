package iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamsDemo {

	public static void main(String[] args) {
		System.out.println("Program started......");
		
		//declare local variables
		File file = new File("D:\\datafiles\\springinfo.txt");	//original 
		File anotherFile = new File("D:\\datafiles\\springinfobuff.txt"); //copied file
		FileReader reader =null;
		FileWriter writer =null;
		BufferedReader bufferedReader =null;
		BufferedWriter bufferedWriter=null;
		
		try {
			 reader = new FileReader(file);
			 writer =  new FileWriter(anotherFile);
			 bufferedReader = new BufferedReader(reader);
			 bufferedWriter =  new BufferedWriter(writer);
			 char[] cbuf= new char[2000];
			 
			 int count = bufferedReader.read(cbuf, 0, 2000); //read first set of characters, of 2000
			 while (count != -1) {
				System.out.println("count:"+count);
				//write that
				//write that read data in char array to another text file 
				bufferedWriter.write(cbuf, 0, 2000);		//write char array to bufferedWriter
				
				//bufferedWriter.flush();
				count = bufferedReader.read(cbuf, 0, 2000);			//read next set of characters, of 2000
			 }
			 
			 bufferedWriter.close();
			 bufferedReader.close();
			 reader.close();
			 writer.close();
			 
		} catch ( IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("program completed successfully..........");
		System.out.println("Program ended......");

	}

}
