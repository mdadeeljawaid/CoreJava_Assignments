package collectionsframework;

import java.util.HashSet;

import fundamentals.Employee;

public class EmployeeHashSetDemo {

	public static void main(String[] args) {
	
		Employee e1 = new Employee("Vijay", 12000.00f);
		Employee e2 = new Employee("Sagar", 11000.00f);
		Employee e3 = new Employee("Vishal", 10000.00f);
		
		Employee e4 = new Employee("Bhushan", 13000.00f);
		Employee e5 = new Employee("Ganesh", 11000.00f);
		Employee e6 = new Employee("Vinayak", 14000.00f);
		
		Employee e7 = new Employee("Jay", 15000.00f);
		
		//hashCode test
		//when hshCode() method is not overridden in Employee class then objects having same state
		// were giving different hash code, since it was based on address of the actual object
		
		//when hshCode() method is  overridden in Employee class then objects having same state
		// are giving same hash code, since, now it is not based on address of the actual object but
		// it is based on object state (object content)
		System.out.println("Hash code of e1 :"+ e1.getName() + ": "+e1.hashCode());
		System.out.println("Hash code of e2 :"+e2.getName() + ": "+e2.hashCode());
		
		try {
			//create objects with same state
			Employee e1Clone = (Employee)e1.clone();
			Employee e2Clone = (Employee)e2.clone();
			
			System.out.println("Hash code of e1Clone, "+ e1Clone.getName() + ": " +e1Clone.hashCode());
			System.out.println("Hash code of e2Clone :"+ e2Clone.getName() + ": "+e2Clone.hashCode());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		//create employeeSet and find a particular employee
		Employee[] empArray = {e1, e2, e3, e4, e5, e6, e7};
		HashSet<Employee> employeeSet = new HashSet<>();
		
		//populate employeeSet
		for(int i=0; i<empArray.length; i++)
			employeeSet.add(empArray[i]);
		
		//search for employee e6
		if(employeeSet.contains(e6))
			System.out.println("Employee with ID="+e6.getEmployeeId() + " is found and his name is:"+e6.getName());
		else 
			System.out.println("Employee with ID="+e6.getEmployeeId() + " is NOT found.");
	}
}