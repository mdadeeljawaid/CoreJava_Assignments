package assignment2;

import java.util.Scanner;

public class AnimalLegs {

	public static void main(String[] args) {
		
		int chicken, cow, pig;
		int totalChickLegs=0, totalCowLegs=0, totalPigLegs=0;
		int chickLegs=2; 
		int cowLegs=4; 
		int pigLegs=4;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of chickens: ");
		chicken = sc.nextInt();
		
		System.out.println("Enter no of cows: ");
		cow = sc.nextInt();
		
		System.out.println("Enter no of pigs: ");
		pig = sc.nextInt();
		
				if (chicken > 0) {
					totalChickLegs = chicken*chickLegs;
				}
		
				if (cow > 0) {
					totalCowLegs = cow*cowLegs;
				}
			
				if (pig > 0) {
					totalPigLegs = pig*pigLegs;
				}
					
				int totalAnimalLegs = totalChickLegs + totalCowLegs + totalPigLegs;
				System.out.println("Total Legs of animals is: "+ totalAnimalLegs );
				}
	}

