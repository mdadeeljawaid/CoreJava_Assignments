/*
* Program : To demonstrate the simple exception handling mechanism in Java
* Program By : Anil Donwade
* Date : 22-Oct-2021
*/
package exceptions;

import java.util.Scanner;

public class SimpleExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program started ..........");
		
		//declare local variables
		int numerator, denominator;
		boolean flag = false;				 //reset flag
		numerator=100; denominator=0;
		
		//loop to repeat accepting a number till correct denominator is entered
		do {
			//try block to guard potentially erroneous code
			try {
				float result =numerator/ denominator;	//potentially erroneous code
				System.out.println("result:"+result);
				flag=false;						//reset flag
			}catch(ArithmeticException e) { //exception handler
				System.out.println(e);
				denominator = acceptNumber(sc);
				flag=true;						//set flag
			}
			
		}while(flag);
		
		sc.close();
		System.out.println("Program ended  ..........");
	}
	
	//method to accept a non-zero number
		private static int acceptNumber(Scanner sc ) {
			int num=0;
			System.out.println("Enter any non-zero number as denomnator:");
		
			if(sc.hasNextInt())
				num = sc.nextInt();
			
			return num;
		}
	}
