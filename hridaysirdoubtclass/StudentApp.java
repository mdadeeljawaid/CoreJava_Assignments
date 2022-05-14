package hridaysirdoubtclass;

//import java.util.Scanner;

//public->global
//default-package private
//protected-within class or type derived from that,package private
//private->within class only to which it belongs

//default class
class Student{
	
	  private  	 int rollNo;	
	  private    String name;	
	  //getter->accessor/inspector
	 public int getRollNo() {
		return rollNo;//read operation
	} 
	 //setter->mutator
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;//write operation
	}
	//getter
	public String getName() {
		return name;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setDetails(int roll,String name) {
		  
		  rollNo=roll;
		  this.name=name;
		  System.out.println("Student details saved!!!!");		  
	  }	  
	 public void displayDetails(){
		  System.out.println("Student details:");
		  System.out.printf("Roll No:%d\tName:%s\n",rollNo,name);
	  }  
	
}
public class StudentApp {

	public static void main(String[] args) {		
		
		Student student=new Student(); 
		student.displayDetails();//0,null
		student.setDetails(1000, "Rahul");
		student.displayDetails();//1000,Rahul
		
		student.setRollNo(2000);
		student.displayDetails();
        
	}

}