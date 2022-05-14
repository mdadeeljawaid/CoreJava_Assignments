package assignment7;

import java.util.*;

public class EmployeesMenuDriven {


	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("1. for Add Employee");
		System.out.println("2. for Display All Employees");
		System.out.println("3. for Search Employee");
		System.out.println("4. for Sort the Employee");
		System.out.println("5. for Update Employee");
		System.out.println("6. for Delete Employee");
		System.out.println("7. for exit");

		int ch,i=0;
		char c;
		String empp,emp,em,e;
		String str[]=new String[5];
		do {
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();

			switch(ch)
			{
			case 1:
				sc.nextLine();
				System.out.println("Enter employee to add: ");
				str[i]=sc.nextLine();
				i++;
				break;
			case 2:
				int j=0;
				while(str[j]!=null) {
					System.out.println(str[j]+" ");
					j++;
				}
				break;
			case 3:
				sc.nextLine();
				System.out.println("Enter a employee to be search: ");
				emp=sc.nextLine();
				try {
					for(String s: str) {
						if(s.equals(emp)) {
							System.out.println("Employee "+emp+" searched successfully");
							break;
						}
					}
				}catch(Exception msg)
				{
					System.out.println("Employee "+emp+" not found");
				}
				break;
			case 4:
				System.out.println("The List of employees in sorting order: ");
				Arrays.sort(str);
				break;
			case 5:
				int count=0;
				sc.nextLine();
				System.out.println("Enter the employee which you want to update: ");
				em=sc.nextLine();
				for(int q=0;q<str.length;q++)
				{
					if(em.equals(str[q])) {
						System.out.println("Enter the new employee: ");
						e=sc.nextLine();
						str[q]=e;
						count++;
						break;
					}	
				}
				if(count==1)
					System.out.println("Updated successfully");
				else
					System.out.println("Employee not found");

				break;
			case 6:
				sc.nextLine();
				int ct=0,p=0;
				System.out.println("Enter the employee which you want to delete: ");
				empp=sc.nextLine();
				try {
					for(p=0;p<str.length;p++)
					{
						if(str[p].equals(empp)) {
							ArrayList list=new ArrayList<String>(Arrays.asList(str));
							list.remove(p);
							ct++;
							break;
						}
					}
					if(ct==1) {
						System.out.println("Removed successfully");
					}
					else
					{
						System.out.println("Employee not found");
					}
				}catch(Exception mgss)
				{
					System.out.println("Employee not found");
				}
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Please enter correct option");
			}
			System.out.print("Do you want to continue[y/n]: ");
			c=sc.next().charAt(0);
		}while(c=='y');
	}

}