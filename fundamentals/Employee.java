
/*
* Program : To create an Employee class
* Program By : Anil Donwade
* Date : 13-Oct-2021
* An Employee class with following features:
* 1. constructors
* 2. accessors
* 3. mutators
* 4. class fields
* 5. static initialization block
* 6. Instance initialization block
* 8. factory methods
* 
* This Employee class is updated with following features (19-Oct-2021):
* 1. overriding of equals() method
* 2. overriding of toString() method
* 3. added findEmployee() nethod
*/
package fundamentals;

import java.util.HashSet;
import java.io.Serializable;
import java.time.LocalDate;

//entity class
public class Employee implements Comparable<Employee>, Cloneable, Serializable {
	//methods
	public Employee() {					//default constructor
		employeeId=1;
		name="";
		salary=0.0f;
		LocalDate joiningDate = LocalDate.now();
	}
	
	public Employee(int employeeId, String name, float salary, LocalDate joiningDate) { //parameterized constructor
		this.employeeId=employeeId;
		this.name=name;
		this.salary=salary;
	}
	
	public Employee( String name, float salary) { //parameterized constructor
		//nextId++;
		this.employeeId=nextId;
		this.name=name;
		this.salary=salary;
	}
	
	public Employee(String string, int i, LocalDate now) {
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeId() {		//accesor methods
		return employeeId;
	}
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	
	public void setSalary(float salary) {		//mutator
		this.salary=salary;
	}
	
	public void display() {						//behavioral method
		System.out.println(employeeId + " " + name  + " " +salary);
	}
	
	//factory method : returns the object the class
	//				   always static method
	public static Employee getProbationEmployee(String name, float salary) {
		Employee temp = new Employee(name, salary);
		//additional logic, if required
		return temp;
	}
	
	public static Employee getInternEmployee(String name, float salary) {
		Employee temp = new Employee(name, salary);
		//additional logic, if required
		return temp;
	}
	
	//override equals() method
	public boolean equals(Object obj){
	//check whether obj null
	if(obj == null)
		return false;
	
	//check obj is of same type
	if( !(obj instanceof Employee) )
	 return false;
	
	Employee temp = (Employee) obj; //down-casting
	
	//check if this and temp referring to same object
	if(this == temp) return true;
	
	 //check every field for equality
	 boolean value = this.employeeId == temp.employeeId
			 && this.salary == temp.salary
			 && this.name.equals(temp.name);
	 return value;
	 }
	
	 //override toString() method
	 public String toString(){
	 return employeeId + " " + name + " " +salary;
	 }
	
	 //method to search an employee
	 public static boolean findEmployee(Employee[] empArray, Employee e) {
	 //declare flag variable
	 boolean found = false;
	
	 int index=0;
	 while( !found && index < empArray.length ) {
	 if(empArray[index].equals(e)) {
	 found = true;
	 continue;
	 }
	 index++;
	 }
	return found;
	 }
	 
	 //override compareTo() method of Comparable interface to order Employee objects
	 //on salary field
	/* @Override
	 public int compareTo(Employee e) {
		 if(salary < e.salary ) return -1; //salary of invoking object is less than passed object
		 else if( salary > e.salary ) return 1; ////salary of invoking object is greater than passed object
		 	
		 return 0; ////salary of invoking object & passed object is equal
	 }
	*/
	 
	 //for ordering employees on the basis of name
	 public int compareTo(Employee e) {
		 return name.compareTo(e.name);
	 }
	 
	 //override clone
	 public Object clone() throws CloneNotSupportedException {
		 Object temp=null;
		 
		 temp = (Employee) super.clone();
		 return temp;
	 }
	 
	 //override hashCode() of object class
	 public int hashCode() {
		 int hashCode=0;
		 	//generate hashCode value based on object state
		 hashCode = employeeId + name.hashCode() + (int)salary/name.length();
		 return hashCode;
	 }
	 
	//initialization blocks
	static {				//static initialization blocks	
		nextId=1000;
		//......
	}
	
	{						//instance initialization blocks	
		nextId++;
		//......
	}
	
	//class field
	private int employeeId;
	String name;					//package-private 
	private float salary;
	
	private static int nextId;		//static class field
										//field initialization
	//static class field is shared by all the objects of the class

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setEmployeeId(int i) {
		// TODO Auto-generated method stub
		
	}

		
	}

