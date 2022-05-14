package fundamentals;

//Ternary Operator is used for decision making ( similar to is statement)
// expression1 ? expression2 : expression3
// where, expression1 is logical expression
// expression2 and expression3 are of any type

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		
		int num=0;
		
		//create the Scanner object
		Scanner sc = new Scanner(System.in);
		
		//accept number
		System.out.println("Enter the number: ");
		if(sc.hasNextInt())
		num=sc.nextInt();
		
		/*if( num % 2 == 0 )
		System.out.println("Number is even");
		else
		System.out.println("Number is odd");
		System.out.println();*/
		
		String message = num % 2 == 0 ? "Number is even" : "Number is odd" ;
		System.out.println(message);
		
		/*int x1=100, x2=200;
		int larger = x1 > x2 ? x1 : x2;
		System.out.println("Larger is:"+larger);
		
		System.out.println("Larger is:"+(x1 > x2 ? x1 : x2));
		 sc.close();*/

	}

}
