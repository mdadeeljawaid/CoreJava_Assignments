/*
 * Program		: To demonstrate the use of RandomAccessFile class to serach
 * 					a record from the file
 */
package iostreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

import fundamentals.Employee;

public class RandomAccessDemo {

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
		
		//write objects
		//write data to file using RandomAccessFile instance
		writeEmployeeObjects(empArray);
	
		//accept the record number to be retrieved
		long recordNumber=acceptRecordNumber();
		
		//retrieve the record
		searchRecord(recordNumber);
		
	}

	private static void searchRecord(long recordNumber) {
		//local variables
		RandomAccessFile randomAccessFile;
		File file=null;
		final int RECORD_SIZE=27;
		byte[] bytes= new byte[100];
		
		try {
				//create object of RandomAccessFile 
				//open the RandomAccessFile in  read mode
				file = new File("E:\\samplefiles\\refemprecords.txt");
				randomAccessFile = new RandomAccessFile( file, "r");
				
				//position the file pointer just before the required record
				long bytePosition=(recordNumber-1)*RECORD_SIZE;
				randomAccessFile.seek(bytePosition);
				
				//read the record in byte array
				//randomAccessFile.read(bytes);
				randomAccessFile.read(bytes, 0, 28);
				
				//display the found record
				String record = new String(bytes);
				System.out.println(record);
				
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
	
	}

	private static long acceptRecordNumber() {
		Scanner sc=new Scanner(System.in);
		long recordNumber=0L;
		System.out.println("Enter Record number to be searched:");
		if(sc.hasNextLong())
			recordNumber=sc.nextLong();
		sc.close();
		return recordNumber;
		
	}

	private static void writeEmployeeObjects(Employee[] empArray) {
		//create object of RandomAccessFile 
		RandomAccessFile randomAccessFile;
		File file=null;
		try {
				file = new File("E:\\samplefiles\\refemprecords.txt");
				randomAccessFile = new RandomAccessFile( file, "rw");
				String record= null;
				//loop to create record strings and to write them in to file
				for(int i=0; i<empArray.length; i++) {
					//get record as a string
					record=getEmployeeRecord(empArray[i]);
					
					//write the record to file
					randomAccessFile.writeBytes(record);
				}
				
				randomAccessFile.close();
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static String getEmployeeRecord(Employee employee) {
		StringBuffer sb = new StringBuffer(50);
		sb.append(employee.getEmployeeId()+", ");
		
		//make name string of equal length
		String empName = adjustSpaces(employee.getName());
		sb.append(empName+", ");
		
		sb.append(employee.getSalary()+"\n");
		return sb.toString();
	}

	private static String adjustSpaces(String name) {
		int nameLength = name.length();
		// if name length is 7  then 5 spaces
		// 1, 2, . . . . 7
		StringBuilder sb= new StringBuilder(name);
		for(int space=1; space<=12-nameLength; space++) 
			sb.append(' ');
		return sb.toString();
	}

}