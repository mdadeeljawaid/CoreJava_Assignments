package iostreams;

/*
 * Program 		: To write records in text format using PrintStream
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintStream;

import fundamentals.Employee;

public class PrintStreamDemo {

	public static void main(String[] args) {
		//create Employee objects
		Employee e1 = new Employee("Vijay", 12000.00f);
		Employee e2 = new Employee("Sagar", 11000.00f);
		Employee e3 = new Employee("Vishal", 10000.00f);
		
		Employee e4 = new Employee("Bhushan", 13000.00f);
		Employee e5 = new Employee("Ganesh", 11000.00f);
		Employee e6 = new Employee("Vinayak", 14000.00f);
		
		Employee e7 = new Employee("Jay", 15000.00f);

		//create employeeTree 
		Employee[] empArray = {e1, e2, e3, e4, e5, e6, e7};
		
		//write Employee records to a file 
		writeEmployees(empArray);
		
		//read Employee records to a file 
		Employee[] empArrayAfterReading = readEmployees();
		
		//display Employees
		display(empArrayAfterReading);
		
	}

	private static void display(Employee[] empArrayAfterReading) {
		for(Employee e: empArrayAfterReading )
			System.out.println(e);
	}

	private static Employee[] readEmployees() {
		File file = new File("E:\\samplefiles\\files.txt");
		
		FileReader fileReader;
		LineNumberReader lineNumberReader ;
		String record;
		Employee[] empArray=new Employee[100];
		
		try {
			fileReader = new FileReader(file);
			lineNumberReader = new LineNumberReader(fileReader); //layering
			
			record=lineNumberReader.readLine();
			int i=0;
			//loop to read a record, form the Employee object and fill the 
			//Employee array
			while(record != null) {
				
				//split the fields
				String[] fields = record.split(",");
				
				//convert fields to their specific type 
				int empId = Integer.parseInt(fields[0]);
				String name = fields[1].trim();
				float salary = Float.parseFloat(fields[2]);	
				
				//create and populate Employee object
				Employee e = new Employee();
				e.setEmployeeId(empId);
				e.setName(name);
				e.setSalary(salary);
				
				//put Employee object in array
				empArray[i]=e;
				i++;
				
				//read next record string from the file
				record=lineNumberReader.readLine();
			}
			
		} catch (  IOException e) {
			e.printStackTrace();
		}
		
		//remove nulls from the Employee array
		int count=0;
		for(int i=0; i<empArray.length; i++) {
			if(empArray[i] != null) {
				count++;
			}
			else 
				break;
		}
		
		Employee[] 	employeeArray= new Employee[count];
		
		//populate the array with count number of records
		for(int i=0; i<empArray.length; i++)
			if(empArray[i] != null)
				employeeArray[i]= empArray[i];
		
		return employeeArray;
	}

	private static void writeEmployees(Employee[] empArray) {
		File file = new File("E:\\samplefiles\\files.txt");
		
		try {
			//create PrintStream instance
			PrintStream printStream = new PrintStream(file);
			
			//loop to repeatedly write records to file
			for(int i=0; i<empArray.length; i++) {
				
				//form the record string
				StringBuffer sb = new StringBuffer(50);
				sb.append(empArray[i].getEmployeeId()+", ");
				sb.append(empArray[i].getName()+", ");
				sb.append(empArray[i].getSalary()+"\n");
				
				//write the record
				String record = sb.toString();
				printStream.append(record);
			}
			
			printStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}