
/*
* Program : To create an application using equals() method for searching an
* employee from the array of employees
* Program By : Anil Donwade
* Date : 19-Oct-2021
*/
package objectclass;

import fundamentals.Employee;

public class EmployeeApplication {

	public static void main(String[] args) {
		
	//create an array of Employee objects
	Employee[] empArray = new Employee[6];
		
	//populate empArray
	empArray[0] = new Employee("Vijay", 10000.00f);
	empArray[1] = new Employee("Vishal", 12000.00f);
	empArray[2] = new Employee("Vikrant", 14000.00f);
	empArray[3] = new Employee("Vikas", 12000.00f);
	empArray[4] = new Employee("Viraj", 13000.00f);
	empArray[5] = new Employee("Vilas", 11000.00f);
		
	//display all employees using enhanced for loop (also known as for-each loop)
	for(Employee e : empArray)
	System.out.println(e);
	
	//employee to be searched
	Employee e = new Employee();
	e.setEmployeeId(1004);
	e.setName("Vikas");
	e.setSalary(12000.00f);
	
	//call method to search an employee from the array
	boolean value = Employee.findEmployee(empArray, e);
	if(value == true)
	System.out.println("The employee "+ e.getName() + " found.");
	else
	System.out.println("The employee "+ e.getName() + " NOT found.");
	
	}

}
