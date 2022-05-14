package fundamentals;

public class MyCircleApp {

	public static void main(String[] args) {
		//instantiate class MyCircle
				MyCircle myCircle = new MyCircle();
				myCircle.calculateArea();
				myCircle.calculateCircumference();
				
				//display area of circle
				System.out.println("Area of Circle is:\n"+ myCircle.getArea());
				
				//instantiate class MyCircle
				MyCircle myCircle1 = new MyCircle(2);
				myCircle1.calculateArea();
				myCircle1.calculateCircumference();
				
				//display area of circle
				System.out.println("Area of Circle is:\n"+ myCircle1.getArea()
						+ "\nCircumference of Circle is:\n"+ myCircle1.getCircumference());
				
				myCircle1.setRadius(20);
				myCircle1.calculateArea();
				myCircle1.calculateCircumference();
				System.out.println("Area of Circle is:\n"+ myCircle1.getArea()
				+ "\nCircumference of Circle is:\n"+ myCircle1.getCircumference());

	}

}
