
/*
* Program : To create sub-class Manager of supe-class Employee
* Program By : Anil Donwade
* Date : 14/10/2021
*/
package relationships;

import fundamentals.Employee;
//sub-class definition
//The sub-class Manager inherits super-class, 
//	Employee attributes-employeeId, name & salary
public class Manager extends Employee {
	//parameterized constructor
	public Manager(String name, float salary,float hra) {
		super(name, salary); 	//super-class constructor is called 
								//super-class fields should be initialized in its own class
								//call to super-class constructor must be the 1st line
								//in sub-class constructor
		
		this.hra = hra;			//sub-class field is initialized here
	}
	
	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}

	public void display() {
		super.display();         // accessing super-class method 
		System.out.println(hra); 
	}
	//class field
	float hra;

}
