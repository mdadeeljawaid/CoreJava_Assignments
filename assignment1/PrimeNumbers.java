package assignment1;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int count=0;
        Scanner scan = new Scanner(System.in);
      
        System.out.print("Enter a Number : ");
        int num = scan.nextInt();
      
        for(int i=2; i<num; i++)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        
        if(count == 0)
        {
            System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number");
	}
        
	}
}
