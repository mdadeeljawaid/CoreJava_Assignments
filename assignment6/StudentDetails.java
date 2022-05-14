package assignment6;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {

		String data;
		Student std = null;
		char ch = 'y';
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> studentList =  new ArrayList<Student>();

		do {
			System.out.println("Enter Roll Number and Name in the format rollNumber:Name");
			data = sc.next();
			boolean flag = false;
			try {
				flag = Student.accept(data);
			} catch (InvalidDataFormat e) {
				System.out.println(data + " is an invalid data format");
			}
			if (flag == true) {
				std = new Student();
				String[] temp = data.split(":");
				std.setRoll_no(Integer.parseInt(temp[0]));
				std.setName(temp[1]);

				studentList.add(std);
			}
			System.out.println("Do you want to continue [Y/N] ?");
			ch=sc.next().charAt(0);
		}
		while(ch == 'y'|| ch == 'Y');
		for(Student temp:studentList)
			temp.display();

		sc.close();

	}

}
