package assignment6;

public class Student {
	int roll_no;
	String name;

	public Student() {
		this.roll_no = 0;
		this.name = " ";
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static boolean accept (String data) throws InvalidDataFormat{
		try {
			if (data == null)
				throw new NullPointerException();

			if(data.matches(".*:.*"));
			throw new InvalidDataFormat(data + "is invalid data format");
		} catch(NullPointerException e) {
			System.out.println("Data entered is null");
		}
		return false;
	}

	public void display() {
		System.out.println("Roll Number : " + roll_no);
		System.out.println("Name : " + name);

	}
}

