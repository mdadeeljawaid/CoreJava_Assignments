
/* Program : To demonstrate the Upcasting and Downcasting in
inheritance hierarchy
* Program By : Anil Donwade
* Date : 18-Oct-2021
*/
package shapes;

public class CastingDemo {

	public static void main(String[] args) {
		
		//instantiate Rectangle class using two parameter constructor //1st
		// and Rectangle reference
		Rectangle rectangle = new Rectangle (10, 5);
		
		Shape shape = rectangle; //implicit type conversion (up-casting)
		shape.calculateArea();
		shape.calculatePerimeter();
		shape.display();
		
		//instantiate Rectangle class using two parameter constructor
		// and Shape class (super class) reference //2nd
		Shape s1 = new Rectangle(100, 40);
		
		Rectangle r1 = (Rectangle) s1; //explicit type conversion (down-casting)
		r1.calculateArea();
		r1.calculatePerimeter();
		r1.display();
		}
	}

