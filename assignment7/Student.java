package assignment7;

import java.util.*;

public class Student {
	private String name,dob;
	private int roll,percent;
	public Student(String name,int roll,int percent,String dob)
	{
		this.name=name;
		this.roll=roll;
		this.percent=percent;
		this.dob=dob;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("percentage: "+percent);
		System.out.println("Date of Birth: "+dob);

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("1. By Name");
		System.out.println("2. By Roll Number");
		System.out.println("3. By Percentage");
		System.out.println("4. By Date of Birth");
		System.out.println("5. Exit");

		String nm,db;
		int r,p,n;
		Student obj=new Student("Rajesh",101,80,"03/02/1996");
		System.out.print("Enter your choice: ");
		n=sc.nextInt();

		switch(n)
		{
		case 1:
			System.out.println("Enter your name: ");
			nm=sc.next();
			if(nm.equals(obj.name))
				obj.display();
			else
				System.out.println(nm+" Not found.");
			break;
		case 2:
			System.out.println("Enter your Roll No: ");
			r=sc.nextInt();
			if(r==obj.roll)
				obj.display();
			else
				System.out.println(r+" Not found.");
			break;
		case 3:
			System.out.println("Enter your percentage: ");
			p=sc.nextInt();
			if(p==obj.percent)
				obj.display();
			else
				System.out.println(p+" Not found.");
			break;
		case 4:
			System.out.println("Enter date of birth: ");
			db=sc.next();
			if(db.equals(obj.dob))
				obj.display();
			else
				System.out.println(db+" Not found.");
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid choice");
		}

	}

}