package practice;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		int n;
		
		System.out.println("Enter the number of stars:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(int i=0; i<+n; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
