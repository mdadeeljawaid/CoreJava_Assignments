package assignment8;

import java.util.Scanner;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence/word : " );
    	str = sc.nextLine();
        int[] freq = new int[str.length()];  
          
        //Converts given string into character array  
        char string[] = str.toCharArray();  
          
        for(int i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(int j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
        }  
          
        //Displays the each character and their corresponding frequency  
        System.out.println("Frequencies of the characters in the string are as below: ");
        System.out.println("****Characters Frequencies****");  
        for(int i = 0; i <freq.length; i++) {  
            if(string[i] != ' ' && string[i] != '0')  
                System.out.println(string[i] + "-" + freq[i]);  
        }  
    }  
}  