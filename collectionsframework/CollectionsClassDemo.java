package collectionsframework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import fundamentals.Employee;

public class CollectionsClassDemo {

	public static void main(String[] args) {
		//create list of numbers
		List<Integer> list = new LinkedList<>();
		
		int[] array = { 23, 56, 11, 89, 32, 66, 92, 48, 192};
		
		//populate linked list
		for(int i=0; i<array.length; i++)
			list.add(array[i]); 				//auto-boxing
		
		//binary search
		Integer index = Collections.binarySearch(list, 9);
		System.out.println("The value is present at index="+index);

		//sort
		Collections.sort(list);
		
		//display the sorted list of integers
		for(Integer i: list)
			System.out.print(i+ " ");
		
		List<Integer> list1 = new LinkedList<>();			//another list
		list1.add(100);
		list1.add(200);
		list1.add(300);
		
		//
		if(Collections.disjoint(list, list1) )
			System.out.println("\nTwo lists: \n" + list + "\n"+list1 + "\nhave no any element common.");
		
		//obtain an emplty list of Employee type
		List<Employee> list2 = Collections.emptyList();
		
		List<Employee> list3 = new LinkedList<>();
		
		Employee[] employees = {new Employee("Vijay", 15000.00f), 
				new Employee("Ganesh", 17000.00f), 
				new Employee("Yashvant", 10000.00f), 
				new Employee("Govind", 12000.00f)};

		//populate the employees list
		for(int i=0; i<employees.length; i++)
			list3.add(employees[i]);
		
		System.out.println("Size of list3 is:"+list3.size());
		
		//display the Employee with maximum salary
		Employee emp = Collections.max(list3);
		
		if(emp != null)
			System.out.println("Employee with maximum salary: "+ emp);
		
		//display the sorted list of Employees
		Collections.sort(list3);
		for(Employee e: list3)
			System.out.println(e+ " ");
		
		//shuffliing the list
		Collections.shuffle(list);
		//display the shuffled  list of integers
		for(Integer i: list)
			System.out.print(i+ " ");
			
	}

}