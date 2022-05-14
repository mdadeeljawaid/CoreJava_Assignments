package collectionsframework;

/*
 * Program 		: To write records in binary format using ObjectOutputStream
 * 					and reading object back in program by using ObjectInputStream
 */

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import fundamentals.Employee;

public class ObjectWritingReading {

	public static void main(String[] args) {
		Employee e1 = new Employee("Vijay", 12000.00f);
		Employee e2 = new Employee("Sagar", 11000.00f);
		Employee e3 = new Employee("Vishal", 10000.00f);
		
		Employee e4 = new Employee("Bhushan", 13000.00f);
		Employee e5 = new Employee("Ganesh", 11000.00f);
		Employee e6 = new Employee("Vinayak", 14000.00f);
		
		Employee e7 = new Employee("Jay", 15000.00f);

		//create employee array 
		Employee[] empArray = {e1, e2, e3, e4, e5, e6, e7};
		
		File file = new File("E:\\samplefiles\\empobjects.txt");
		
		writeEmployees(file, empArray);
		
		Employee[] empAfterReadingArray = readEmployees(file);
		
		displayEmployees(empAfterReadingArray);
	}

	//method to display Employee objects from array passed as parameter
	private static void displayEmployees(Employee[] empAfterReadingArray) {
		for(Employee e : empAfterReadingArray)
			System.out.println(e);
	}

	//method to read Employee objects from file and to return
	//array of read objects
	private static Employee[] readEmployees(File file) {
		FileInputStream fileInputStream ;
		ObjectInputStream objectInputStream;
		Employee[]  employeeTempArray = new Employee[100],
				employeeArray=null;
		int i=0;
		//create ObjectInputStream 
		try {
			fileInputStream = new FileInputStream(file);
			objectInputStream = new  ObjectInputStream(fileInputStream);
			
			//read first object
			Employee e =(Employee)objectInputStream.readObject();
			
			//loop to repeatedly read Employee objects till the EOF
			while( e != null) {
				employeeTempArray[i]=e;		//put Employee object into array
				//System.out.println("e="+e);
				
				//read next Employee object
				e =(Employee)objectInputStream.readObject();
				i++;
			}
			
			objectInputStream.close();
			fileInputStream.close();
			
		}catch (EOFException e) {
			
			System.out.println("File read successfully ..........");
			//create new Employee array
			//System.out.println("i="+i);
			employeeArray=new Employee[i+1];
			//System.out.println("employeeArray.length="+employeeArray.length);
			
			//loop to transfer objects from temporary array to 
			// array to be returned
			for(int j=0; j<employeeArray.length; j++) {
				employeeArray[j]=employeeTempArray[j];
				//System.out.println("employeeArray[j]"+employeeArray[j]);
			}
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return employeeArray;
	}

	//method to write Employee objects from array passed as parameter
	private static void writeEmployees(File file, Employee[] empArray) {
		FileOutputStream fileOutputStream ;
		ObjectOutputStream objectOutputStream;
		
		try {
			//create ObjectOutputStream 
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			//loop to repeatedly write Employee objects
			for(int i=0; i<empArray.length; i++)
				objectOutputStream.writeObject(empArray[i]);
			
			objectOutputStream.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}