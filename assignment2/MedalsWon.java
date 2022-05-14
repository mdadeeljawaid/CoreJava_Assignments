package assignment2;

import java.util.Scanner;

public class MedalsWon {
		
		public String country1;
		public String country2;
		public String country3;
		public String country4;
		public String country5;

		public MedalsWon(String country1, String country2, String country3, String country4, String country5) {
			this.country1=country1;
			this.country2=country2;
			this.country3=country3;
			this.country4=country4;
			this.country5=country5;		
		}

		public void display() {
			System.out.println(" ___________________________________________");
			System.out.println("|S.No.  |        Medals Won      |  Country |");
			System.out.println("|_______|________________________|_________ |");
			System.out.println("  1.    |  Gold, Silver, Bronze  |  "+country1);
			System.out.println("  2.    |  Gold, Silver, Bronze  |  "+country2);
			System.out.println("  3.    |  Gold, Silver, Bronze  |  "+country3);
			System.out.println("  4.    |  Gold, Silver, Bronze  |  "+country4);
			System.out.println("  5.    |  Gold, Silver, Bronze  |  "+country5);
			System.out.println("________|________________________|___________");
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("-----------------------------MEDALS WON BY FIVE COUNTRIES------------------------------------");
			
			System.out.print("Enter the 1st country name : ");
	    	String	country1=sc.nextLine();
			
			System.out.print("Enter the 2nd country name : ");
			String country2=sc.nextLine();
			
			System.out.print("Enter the 3rd country name : ");
			String country3=sc.nextLine();
			
			System.out.print("Enter the 4th country name : ");
		    String	country4=sc.nextLine();
			
			System.out.print("Enter the 5th country name : ");
			String country5=sc.nextLine();
			
			MedalsWon obj = new MedalsWon(country1,country2,country3,country4,country5);
			
			obj.display();

	}

}
