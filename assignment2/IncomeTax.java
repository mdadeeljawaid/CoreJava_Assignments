package assignment2;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		
		int salary, additionalAmt;
		double incTax;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your salary: ");
		salary = sc.nextInt();
		 
				if (salary <= 50000) {
					additionalAmt=0;
				incTax=additionalAmt; 
				 System.out.println("Total Income Tax is: "+ incTax);
				}
		
				else if (salary >= 50000 && salary <= 60000) {
					additionalAmt=(salary-50000);
				incTax=(additionalAmt*10)/100;
				System.out.println("Total Income Tax is: "+ incTax);
				}
			
				else if (salary >= 50000 && salary <= 150000) {
					additionalAmt=(salary-50000);
				incTax=(additionalAmt*20)/100;
				System.out.println("Total Income Tax is: "+ incTax);
				}
					
				else if (salary >= 50000 && salary >= 150000) {
					additionalAmt=(salary-50000);
				incTax=(additionalAmt*30)/100;
				System.out.println("Total Income Tax is: "+ incTax);
				}
						
		}
} 

