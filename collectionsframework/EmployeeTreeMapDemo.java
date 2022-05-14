package collectionsframework;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeMap;

import fundamentals.Employee;

public class EmployeeTreeMapDemo {

	public static void main(String[] args) {
		//CASE I
		//create Employee TreeMap
		TreeMap<Employee, Employee> employeeTreeMap = new TreeMap<>();
		
		//populate  Employee TreeMap
		Employee e1 = new Employee("Vijay", 12000.00f);
		Employee e2 = new Employee("Sagar", 11000.00f);
		Employee e3 = new Employee("Vishal", 10000.00f);
		
		Employee e4 = new Employee("Bhushan", 13000.00f);
		Employee e5 = new Employee("Ganesh", 11000.00f);
		Employee e6 = new Employee("Vinayak", 14000.00f);
		
		Employee e7 = new Employee("Jay", 15000.00f);

		//create employeeTree 
		Employee[] empArray = {e1, e2, e3, e4, e5, e6, e7};
		
		for(int i=0; i<empArray.length; i++)
			employeeTreeMap.put(empArray[i],empArray[i]);
		
		//display Values only from the employeeTreeMap
		displayValues(employeeTreeMap);
		
		//-----------------------------------------
		//CASE II
		//create Employee TreeMap, by passing instance of anonymous inner class
		//which implements the comparator interface, for ordering Employee objects 
		//on the basis of salary
		TreeMap<Employee, Employee> employeeTreeMapSalary 
			= new TreeMap<>(new Comparator<Employee>() {

				@Override
				public int compare(Employee e1, Employee e2) {
					if(e1.getSalary() < e2.getSalary()) return -1;
					else if(e1.getSalary() > e2.getSalary()) return 1;
					return 0;
				}
				
			});
		
		//populate employeeTreeMapSalary
		for(int i=0; i<empArray.length; i++)
			employeeTreeMapSalary.put(empArray[i],empArray[i]);
		
		//display Values as per the order of salary
		System.out.println("display Values as per the order of salary:");
		displayValues(employeeTreeMapSalary);

	}

	private static void displayValues(TreeMap<Employee, Employee> employeeTreeMap) {
		Collection<Employee> collection = employeeTreeMap.values();
		
		Iterator<Employee> itr = collection.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}