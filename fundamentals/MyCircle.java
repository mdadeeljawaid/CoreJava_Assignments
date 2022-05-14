
/*
* Program : To create a class for the Circle entity
* Program By : Anil Donwade
* Date : 13-Oct-2021
*
* An Employee class with following features:
* 1. constructors
* 2. accessors
* 3. mutators
* 4. class fields
*/
package fundamentals;

public class MyCircle {
		
	//methods
	public MyCircle(){				//default constructor
		radius=1;
	}
	
	public MyCircle(double radius){			//parameterized constructor
		this.radius=radius;					// 'this' is the the implicit reference parameter 
	}
	
	public void calculateArea(){			//Logic (behavioral method)
		 area = 3.14 * radius * radius;		// 'this' is the the implicit reference parameter
	}
	
	public void calculateCircumference(){	//Logic (behavioral method)
		circumference = 2 * 3.14 * radius;
	}
	
	public double getArea() {		//accessor method
		return area;
	}
	
	public double getCircumference() {		//accessor method
		return circumference;
	}
	
	public void setRadius(double radius){	//mutator
		this.radius=radius;
	}
	
	//class fields
	private double radius, circumference, area;


}
