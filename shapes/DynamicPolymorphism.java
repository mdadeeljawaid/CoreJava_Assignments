
/* Program : To demonstrate the Dynamic Polymorphism feature of OOP
* Program By : Anil Donwade
* Date : 18-Oct-2021
*/
/*
Important Programming concepts:
1. Class inheritance hierarchy
2. Super class reference
3. Concrete subclasses
4. binding (also known as compile time binding or static binding or early binding)
5. late binding (also known as runtime binding or dynamic binding )
6. Overriding means implementing superclass method in subclass
7. Using super class reference to refer to subclass object
*/
package shapes;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		
		//instantiate Rectangle using super class reference
		Shape s1 = new Rectangle(10, 5);
		s1.calculateArea(); //polymorphic method //1a
		s1.calculatePerimeter(); //polymorphic method //1b
		s1.display();
		
		//instantiate Circle using super class reference
		s1 = new Circle(10);
		s1.calculateArea(); //polymorphic method //2a
		s1.calculatePerimeter(); //polymorphic method //2b
		s1.display();
		
		//create the array of Shape type
		Shape[] shapeArray = new Shape[4];
		
		//populate the shapeArray
		shapeArray[0] = new Rectangle(10, 5);
		shapeArray[1] = new Circle(10);
		shapeArray[2] = new Rectangle(20, 10);
		shapeArray[3] = new Circle(20);
		
		//loop to process the shapeArray
		for(int i=0; i<shapeArray.length; i++) {
		// call to polymorphic method (in either Rectangle or Circle )
		// to calculate area
		shapeArray[i].calculateArea();
		
		// call to polymorphic method (in either Rectangle or Circle )
		// to calculate Perimeter / Circumference
		shapeArray[i].calculatePerimeter();
		
		// call to polymorphic method (in either Rectangle or Circle )
		// to display particular shape data
		shapeArray[i].display();
		}
		}
		}
		
		//subclass of Shape
		class Circle extends Shape{
		
		public Circle(int radius) {
		super();
		
		this.radius = radius;
		}
		
		@Override
		public void calculateArea() {
		//float = double //if you try to assign double type value to
		// float type variable then overflow is happening
		// hence type casting is necessary
		//area = (float)Math.PI * (float)Math.pow(radius, 2); //this one way
		area = (float)(Math.PI * Math.pow(radius, 2)); //this is another way
		}
		
		@Override
		public void calculatePerimeter() {
		//perimeter = 2*(float)Math.PI*radius; //either perimeter
		circumference = 2*(float)PI*radius; // or circumference we can
		// use since conceptually they are same
		}
		
		public int getRadius() {
		return radius;
		}
		
		public void setRadius(int radius) {
		this.radius = radius;
		}
		
		//we can add our own valid logic in getter method
		public float getCircumference() {
		//calculatePerimeter(); //call method to calculate
		//return perimeter; // perimeter & then return
		return circumference; //OR directly return circumference
		}
		
		public void setCircumference(int circumference) {
		this.circumference = circumference;
		}
		
		//overridden polymorphic method
		public void display() {
		System.out.println("radius="+ radius
		+ " circumference="+ getCircumference()
		+ " area="+area);
		}
	
		//CLASS FIELDs
		int radius;
		float circumference;
		final static float PI=3.14159265f; //geometric constant PI

}
