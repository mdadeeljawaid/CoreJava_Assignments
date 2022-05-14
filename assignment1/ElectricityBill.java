package assignment1;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		
		System.out.println("Press 1 for 1 to 100 units");
		System.out.println("Press 2 for 101 to 200 units");
		System.out.println("Press 3 for 201 to 300 units");
		System.out.println("Press 4 for 501 onward units");
		System.out.println("Press 5 for exit");
		
		int units,ch, amount=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice: ");
		ch=sc.nextInt();
		
		System.out.println("Enter the units consumed: ");
		units = sc.nextInt();
		
		switch( ch ) {
		case 1 : amount=units*6; break;
				
			case 2 : amount = (100*6) + ((units-100)*7); break;
			
				case 3 : amount = ((100*6)+(100*7)) + ((units-200)*8); break;
					
					case 4 : amount = ((100*6)+(100*7)+(300*7)) + ((units-500)*9); break;
						
						case 5 : System.exit(5);
					
							default : System.out.println("Invalid choice");
									
		}
				
		System.out.println("Amount of Electricity Bill to be paid is : "+ amount);

	}
} 


