/*
* Program : To demonstrate overriding of Object class methods
* Program By : Anil Donwade
* Date : 19-Oct-2021
*/
/*
* This class demonstrates the use of Object class methods :
* 1. equals() and
* 2. toString()
*/

package objectclass;

import fundamentals.Employee;

public class ObjectDemo {

	public static void main(String[] args) {
		
		String s1 = "Good", s2="Morning";
		
		boolean value = s1.equals(s2);
		 if(value == true)
		 System.out.println(s1 + " and " + s2 + " are equal.");
		 else
		 System.out.println(s1 + " and " + s2 + " are NOT equal.");
		
		 value = s1.equals("Good");
		 if(value == true)
		 System.out.println(s1 + " and " + "Good" + " are equal.");
		 else
		 System.out.println(s1 + " and " + "Good" + " are NOT equal.");
		
		 //--------------------------------------------------------------------------------
		
		 if( s1 == s2) // reference addresses are compared
		 System.out.println(s1 + " and " + s2 + " are equal.");
		 else
		 System.out.println(s1 + " and " + s2 + " are NOT equal.");
		
		 s2=s1;
		 if( s1 == s2)
		 System.out.println(s1 + " and " + s2 + " are equal.");
		 else
		 System.out.println(s1 + " and " + s2 + " are NOT equal.");
		
		 s2 = new String("Good");
		 if( s1 == s2) //gives wrong answer,hence not reliable using == for objects
		 System.out.println(s1 + " and " + s2 + " are equal.");
		 else
		 System.out.println(s1 + " and " + s2 + " are NOT equal.");
		
		 //check the equality of Employee objects
		
		 Employee e1 = new Employee("Sujeet", 12000.00f);
		 Employee e2 = new Employee("Suraj", 14000.00f);
		
		 if(e1.equals(e2))
		 System.out.println(e1.getEmployeeId() + " and " + e2.getEmployeeId() + " are equal.");
		 else
		 System.out.println(e1.getEmployeeId() + " and " + e2.getEmployeeId() + " are NOT equal.");
		 
		 e2 = e1;
		  if(e1.equals(e2))
		  System.out.println(e1.getEmployeeId() + " and " + e2.getEmployeeId()
		  + " are equal.");
		  else
		  System.out.println(e1.getEmployeeId() + " and " + e2.getEmployeeId()
		  + " are NOT equal.");
		 
		  Employee e3 = new Employee("Vijay", 12000f);
		 
		  //create another employee
		  Employee e4 = new Employee();
		 
		  //set values equal to e3
		  e4.setEmployeeId(e3.getEmployeeId());
		  e4.setName(e3.getName());
		  e4.setSalary(e3.getSalary());
		 
		  //now e3 and e4 are referring to different objects but have same data
		  //surely e3 == e4 will not give correct result of checking equality
		  if(e3.equals(e4))
		  System.out.println(e3.getEmployeeId() + " and " + e4.getEmployeeId() + " are equal.");
		  else
		  System.out.println(e3.getEmployeeId() + " and " + e4.getEmployeeId() + " are NOT equal.");
		 
		  //display employee data using toString()
		  System.out.println(e3); //e3.display();
		  System.out.println(e4); //e3.display();

	}

}
