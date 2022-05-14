package fundamentals;
	
	import java.util.Scanner;

	public class UserInput {

		public static void main(String []args) {
			Scanner sc=new Scanner(System.in);
			int id;
			float salary;
			String name;		
			System.out.println("Enter ID :");
			id=sc.nextInt();//for integer input
			System.out.println("Enter Salary:");
			salary=sc.nextFloat();////for float input
			System.out.println("Enter Name:");
			name=sc.next();//single word string 
			//name=sc.nextLine();//multi word string input until newline occurs
			System.out.println("Details are:");
			System.out.printf("ID:%d\tName:%s\tSalary:%f",id,name,salary);
			
			
		}
	}

