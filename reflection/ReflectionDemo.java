package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;

import fundamentals.Employee;

public class ReflectionDemo {

	public static void main(String[] args) {
		//instantiate Employee class
		Employee employee = new Employee("Ravi", 10000, LocalDate.now());
		
		//obtain a reference of the type Class
		Class<? extends Employee> empClass = employee.getClass();
		
		displayConstructors(empClass);
		displayMethods(empClass);
		displayClassFields(empClass);
	}

	private static void displayClassFields(Class<? extends Employee> empClass) {
		//Field[] fields = empClass.getFields();	// this can not give private members
		Field[] fields = empClass.getDeclaredFields();
		System.out.println("\nFields of " + empClass.getName()+ ": ");
		for(Field f : fields)
			System.out.println(f);
	}

	private static void displayMethods(Class<? extends Employee> empClass) {
		System.out.println("\nMethods of " + empClass.getName()+ ": ");
		Method[] array = empClass.getMethods();
		
		for(Method m: array)
			System.out.println(m);
	}

	private static void displayConstructors(Class<? extends Employee> empClass) {
		System.out.println("Constructors of " + empClass.getName()+ ": ");
		Constructor[] array = empClass.getConstructors();
		
		for(int i=0; i< array.length; i++)
			System.out.println(array[i]);
	}
}