package assignment1;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First number: ");
		a = sc.nextInt();
		
		System.out.println("Enter the Second number: ");
		b = sc.nextInt();
		
		System.out.println("Enter the Third number: ");
		c = sc.nextInt();
		
		if(a > b && a > c) {
			System.out.println("Largest number is "+a);
		}
				
			else if(b > c && b > a) {
				System.out.println("Largest number is "+b);
			}
			else {
				System.out.println("Largest number is "+c);
			}
		
		
			}
			
		}



