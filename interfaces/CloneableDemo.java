package interfaces;

import fundamentals.Employee;

public class CloneableDemo {
	public static void main(String[] args) throws CloneNotSupportedException {

		Employee e1 = new Employee("Jay", 12000);
		System.out.println(e1);		//original
		
		//Problem with copying reference
		Employee e2 = e1;
		System.out.println(e2);		//replica
		
		e2.setName("Prakash");		//when e2 is changing. . .
		
		System.out.println(e1);		// e1(original) also changes. This is the problem
									// here e1 being original should not change
		System.out.println(e2);
		
		e1.setName("Jay");
		Employee e2Clone= (Employee) e1.clone();	//down-casting
		
		System.out.println("Before cloning, e2Clone = "+e2Clone);
		
		
		e2Clone.setName("Prakash");
		System.out.println(e1);		// e1(original) is also changes. This is the problem
		System.out.println("After cloning, e2Clone = "+e2Clone);
	}
}
