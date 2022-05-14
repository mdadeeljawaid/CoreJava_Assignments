package interfaces;

import java.util.Arrays;

import fundamentals.Employee;

public class ComparableDemo {

	public static void main(String[] args) {
		
			//create an array of Employee objects
			Employee[] empArray = new Employee[6];
			
			//populate empArray
			empArray[0] = new Employee("Vijay", 15000.00f);
			empArray[1] = new Employee("Vishal", 12000.00f);
			empArray[2] = new Employee("Vikrant", 14000.00f);
			empArray[3] = new Employee("Vikas", 12000.00f);
			empArray[4] = new Employee("Viraj", 13000.00f);
			empArray[5] = new Employee("Vilas", 11000.00f);
			
			//display all employees using enhanced for loop (also known as for-each loop)
			for(Employee e : empArray)
				System.out.println(e);
			
			//sort Employee objects on the basis of salary
			Arrays.sort(empArray);
			
			System.out.println("\nemployees sorted on the basis of salary:");
			//display all employees using enhanced for loop (also known as for-each loop)
			for(Employee e : empArray)
				//System.out.println(e);
				e.display();
			
			//sort Employee objects on the basis of name
			Arrays.sort(empArray);
			
			System.out.println("\nemployees sorted on the basis of Name:");
			//display all employees using enhanced for loop (also known as for-each loop)
			for(Employee e : empArray)
				//System.out.println(e);
				e.display();
			
			//Not possible
			//Comparable<Employee> interfaceRef = new Comparable<Employee>();
		}


	}


