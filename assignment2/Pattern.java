package assignment2;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows to print the pattern: ");
		
		int n=sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(k);
			}
			for (int l=i-1; l>=1; l--) {
				System.out.print(l);
			}
			System.out.println();
			
		}

	}

}
