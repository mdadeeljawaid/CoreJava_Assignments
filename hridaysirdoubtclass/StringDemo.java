
//WAP to find no of words and max length word in a user input "Multi word string value" without using built-in method.
package hridaysirdoubtclass;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[]args) {
		
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string:");
		//this is string handling using java"
		//no of words:6
		//max length word:handling
		str=sc.nextLine();
		int words=0;//for storing word count
		int max=0;//for maxlength word
		int pos=0;//for start position of maxlength word
		int count=0;//to calculate maxlength and position
		for(int i=0;i<str.length();i++) {
			
			//System.out.println(str.charAt(i));
			//here you have to put the logic
			if(str.charAt(i)==' '||(i+1)==str.length()) {				
				words++;//3
				if((i+1)==str.length())
				{  
					count++;
					//System.out.println("max:"+max+"\tcount:"+count);
				}
				//max=4,count=5
				if(count>max) {
					max=count;//5
					if((i+1)!=str.length())
					{
					      pos=i-count;//14-5=>9
					          //this is string 
					      //System.out.println("in if");
					}
					else 
					{
						  pos=i-count+1;
						  //System.out.println("in else");
				    }
					          
				}
				count=0;
			}
			else
				count++;//5								
		}
		System.out.println("total words:"+(words));
		System.out.println("max length:"+max);
		System.out.println("start position:"+pos);
		//displaying
        for(int i=pos;i<pos+max;i++) {		
			
        	System.out.print(str.charAt(i));
			
		}
     //aabbcbbaa 
     //aabbcbbad  
        
	}
}