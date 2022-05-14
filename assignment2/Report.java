package assignment2;

public class Report {
		
		private int admNo=1111; 
		private String name="Adeel";
		private double marks=(65.25+79.88+88.20+60.66+70.21);
		private double average;
		
		private void get_Average() {
			 average=marks/5;
			 System.out.println("Average marks: "+average);
		}
		
		public void display_Info() {
			System.out.println("Admission number: "+admNo +" " +"Name: "+name);
			System.out.println("Total Marks: "+marks);
		
		}
		
		public static void main(String[] args) {
			
			System.out.println("*******Report ~ Card*******");
					
			Report student = new Report();
			
			student.display_Info();
			student.get_Average();

	}

}
