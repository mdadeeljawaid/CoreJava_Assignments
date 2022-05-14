package assignment8;

/*
 * Ques4. WAP to read data from text file and perform the below operations:
 *  No of characters in file
 *  No of words in file
 *  No of lines in file
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) 
	{
		BufferedReader reader = null;
		
		//Initializing charCount, wordCount and lineCount to 0
		
		int charCount = 0;
		
		int wordCount = 0;
		
		int lineCount = 0;
		
		try {
		
			reader = new BufferedReader(new FileReader("C:\\Users\\Adeel\\Desktop\\Readfile.txt"));	//Creating BufferedReader object
			
			String currentLine = reader.readLine();	//Reading the first line into currentLine
			
			while (currentLine != null) {
			
				lineCount++;	//Updating the lineCount
				
				String[] words = currentLine.split(" ");	//Getting number of words in currentLine
				
				wordCount = wordCount + words.length;	//Updating the wordCount
				
				for (String word : words) {		//Iterating each word
				
					charCount = charCount + word.length();	//Updating the charCount
				}
				
				currentLine = reader.readLine();	//Reading next line into currentLine
			}
			
			System.out.println("Number Of Chars In A File : "+charCount);	//Printing charCount
			
			System.out.println("Number Of Words In A File : "+wordCount);	//Printing wordCount
			
			System.out.println("Number Of Lines In A File : "+lineCount);	//Printing lineCount
		} 
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		finally {
		
			try {
			
				reader.close();           //Closing the reader
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}	
}