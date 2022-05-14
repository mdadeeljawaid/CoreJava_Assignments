package collectionsframework;

import java.util.Comparator;
import java.util.TreeSet;

import fundamentals.Employee;

public class EmployeeOrdering {

	public static void main(String[] args) {
		Employee e1 = new Employee("Vijay", 12000.00f);
		Employee e2 = new Employee("Sagar", 11000.00f);
		Employee e3 = new Employee("Vishal", 10000.00f);
		
		Employee e4 = new Employee("Bhushan", 13000.00f);
		Employee e5 = new Employee("Ganesh", 11000.00f);
		Employee e6 = new Employee("Vinayak", 14000.00f);
		
		Employee e7 = new Employee("Jay", 15000.00f);

		//create employeeTree 
		Employee[] empArray = {e1, e2, e3, e4, e5, e6, e7};
		//when default constructor of TreeSet class is used then
		//ordering of objects is as per the natural order of the 
		//Employee class
		TreeSet<Employee> empTreeSet =  new TreeSet<>();
		
		//populate empTreeSet
		for(int i=0; i<empArray.length; i++)
			empTreeSet.add(empArray[i]);
		
		//display employees in empTreeSet in its natural order
		System.out.println("display employees in empTreeSet in its natural order:");
		display(empTreeSet);
		
		//create empTreeSet as per ordering of salary
		EmpComparatorSalaryImpl empComparatorSalaryImpl = new EmpComparatorSalaryImpl();
		
		//pass instance of Comparator implementation class to the TreeSet constructor
		TreeSet<Employee> empTreeSetSalary = new TreeSet<>( empComparatorSalaryImpl );
		
		//populate empTreeSetSalary
		empTreeSetSalary.addAll(empTreeSet);
		
		//display employees in empComparatorSalaryImpl in the order of their salary
		System.out.println("display employees in empComparatorSalaryImpl in the order of their salary: ");
		display(empTreeSetSalary);
		
		//using anonymous inner class for Comparator implementation,
				// create, instantiate and pass as parameter object of anonymous class
				TreeSet<Employee> empTreeSetSalary1 = new TreeSet<>( new Comparator<Employee>() {

					@Override
					public int compare(Employee e1, Employee e2) {
						if( e1.getSalary() < e2.getSalary() ) return -1;//salary of invoking object is 
																		//less than passed object

						else if( e1.getSalary() > e2.getSalary()) return 1;	//salary of invoking object is 
																		//greater than passed object

						return 0; //salary of invoking object &  passed object is equal
					}
					
				} );
				
				//populate empTreeSetSalary1
				empTreeSetSalary1.addAll(empTreeSet);
				
				//display employees empTreeSetSalary1 in the order of their salary
				System.out.println("display employees in empComparatorSalaryImpl in the order of their salary: ");
				display(empTreeSetSalary1);

		
	}

	private static void display(TreeSet<Employee> empTreeSet) {
		//use enhanced for loop
		for(Employee e : empTreeSet)
			System.out.println(e);
	}

}


//class to Implement Comparator to compare the Employee objects based on salary field
class EmpComparatorSalaryImpl implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if( e1.getSalary() < e2.getSalary() ) return -1;		//salary of invoking object is 
												//less than passed object

		else if( e1.getSalary() > e2.getSalary()) return 1;	//salary of invoking object is 
												//greater than passed object

		return 0; //salary of invoking object &  passed object is equal
	}
	
}