package fundamentals;

public class EmployeeApplication {

	public static void main(String[] args) {
		//instantiate Employee class
		/*	Employee employee = new Employee();		//default constructor method gets invoked
			employee.display();
			
			Employee employee1 = new Employee(101, "Vijay", 12000.00f); //parameterized constructor method gets invoked
			employee1.display();
			
			System.out.println("Salary of " + employee1.getName() + " is "+ employee1.getSalary());
			
			//accept salary from user 
			//.....
			
			employee1.setSalary(14000.00f);		// muataor use
			System.out.println("Now, Salary of " + employee1.getName() + " is "+ employee1.getSalary());
			
			Employee employee2 = new Employee(102, "Sagar", 11000.00f); 
			employee2.display();
			*/
			
			Employee e1 = new Employee("Vijay", 12000.00f);
			Employee e2 = new Employee("Sagar", 11000.00f);
			Employee e3 = new Employee("Vishal", 10000.00f);
			
			e1.display();
			e2.display();
			e3.display();
			
		//	Employee e4 = new Employee(12, "Vishal", 10000.00f);
		//	e4.display();
			
			Employee e5 = Employee.getProbationEmployee("Sunil", 7000.00f);
			e5.display();
			
			//static method is called with class name 
			Employee e6 = Employee.getInternEmployee("Mahesh", 4000.00f);
			e6.display();


	}

}
