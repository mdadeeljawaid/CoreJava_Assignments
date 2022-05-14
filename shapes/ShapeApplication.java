package shapes;
		
		/* Program : To create an abstract class and its subclass
		 * Program By : Anil Donwade
		 * Date : 18-Oct-2021
		 */
		
		 /*
		 * Important Programming concepts:
		 * 1. Abstract class
		 * 2. Overriding
		 * 3. Overloading
		 * 4. Use of the protected keyword
		 * 5. implementing superclass abstract method in subclass
		 * 6. Using super class reference to refer to subclass object
		 * 7. The use of final keyword
		 */
		
		 public class ShapeApplication {
		
		 public static void main(String[] args) {
		 //instantiate Rectangle class using two parameter constructor //1st object
		 Rectangle rectangle = new Rectangle (10, 5);//two parameter constructor
		 //will be called
		
		 //invoke methods using Rectangle class reference
		 rectangle.calculateArea();
		 rectangle.calculatePerimeter();
		 rectangle.display();
		
		 System.out.println();
		
		 //instantiate Rectangle class using Shape class reference
		 //super class reference can refer to subclass object
		 Shape shape = new Rectangle (10, 5); //2nd object
		
		 //invoke methods using Rectangle class reference
		 shape.calculateArea();
		 shape.calculatePerimeter();
		 shape.display();
		
		 //instantiate Rectangle class using one parameter constructor //3rd object
		 rectangle = new Rectangle (10);// one parameter constructor will be called
		
		 //invoke methods using Rectangle class reference
		 rectangle.calculateArea();
		 rectangle.calculatePerimeter();
		 rectangle.display();
		
		 //instantiate Rectangle class using default constructor //4th object
		 rectangle = new Rectangle (); // default constructor will be called
		
		 //invoke methods using Rectangle class reference
		 rectangle.calculateArea();
		 rectangle.calculatePerimeter();
		 rectangle.display();
		
		 //instantiate Cuboid class
		 Cuboid cuboid = new Cuboid(10, 5, 20);
		 System.out.println("The volume is :"+ cuboid.calculateVolume());
		 cuboid.display();
		
		 //using getter & setter methods of Cuboid class
		 cuboid.setLength(12);
		  cuboid.setHeight(40);
		  System.out.println("\nVolume of cuboid: " + cuboid.calculateVolume());
		  System.out.println("Length of cuboid:"+cuboid.getLength()) ;
		  System.out.println("Width of cuboid:"+cuboid.getWidth()) ;
		 

	}

}
