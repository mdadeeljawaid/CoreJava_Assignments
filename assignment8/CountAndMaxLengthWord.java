package assignment8;

import java.util.Scanner;

public class CountAndMaxLengthWord {
	
	public static void main(String args[]) {
			int wordCount = 0; 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a sentence/word : ");
			String str = sc.nextLine();
			
			for(int i = 0; i < str.length()-1; i++) {  
	            //Counts all the spaces present in the string  
	            //It doesn't include the first space as it won't be considered as a word  
	            if(str.charAt(i) == ' ' && Character.isLetter(str.charAt(i+1)) && (i > 0)) {  
	                wordCount++;  
	            }  
	        }  
	        //To count the last word present in the string, increment wordCount by 1  
	        wordCount++;  
	       
			str += " "; 		//Add space at end of string
			String word = "", longestWord = "";
			int len = str.length();
	       
			for (int j = 0; j < len; j++) {
	           char ch = str.charAt(j);
	           if (ch == ' ') {
	               
	                if (word.length() > longestWord.length())
	                	longestWord = word;
	                    
	                word = "";
	           }
	           else {
	               word += ch;
	           }
	       }
				//Displays the total number of words present in the given string  
	        	System.out.println("Total number of words in the given string: " + wordCount);
	        	//Displays the longest word and length of the longest word present in the given string
	        	System.out.println("The longest word is : " + longestWord +
	        	"\nThe length of the longest word is : " + longestWord.length());
	    }
	    
	}
