package shapes;
//super class
public abstract class Shape {
	
	//methods
	 public abstract void calculateArea(); //polymorphic abstarct method
	 public abstract void calculatePerimeter(); //polymorphic abstarct method
	
	 public float getArea() {
	 return area;
	 }
	 public void setArea(float area) {
	 this.area = area;
	 }
	 public float getPerimeter() {
	 return perimeter;
	 }
	 public void setPerimeter(float perimeter) {
	 this.perimeter = perimeter;
	 }
	
	 public void display() { //polymorphic concrete method
	 System.out.println("Area=" + area + " Perimeter=" +perimeter);
	 }
	
	 //class fields
	 protected float area;
	 protected float perimeter;
	 }
	
	 //subclass : Rectangle IS-A TYPE of Shape
	 class Rectangle extends Shape{
	 //overloading of method means defining method with same name in the class
	 //with difference in parameters
	 //The parameters difference can be either in
	 // a) number of parameters
	 // b) type of parameters
	 // c) sequence of parameters
	 // This is also known as static polymorphism
	
	 //default constructor
	 public Rectangle() {
	 this.length = 1;
	 this.width = 1;
	 }
	
	 //parameterized constructor
	 public Rectangle(int length, int width) { // two parameter constructor
	 this.length = length;
	 this.width = width;
	 }
	
	 //parameterized constructor
	 public Rectangle(int length) { // one parameter constructor
	 this.length = length;
	 this.width = 7;
	 }
	
	 @Override
	 public final void calculateArea() { //method overriding
	 area = length * width; // now, in Rectangle class calculateArea()
	// is a concrete method after overriding
	  }
	 
	  @Override
	  public final void calculatePerimeter() { //method overriding
	  perimeter = 2*(length + width); //now, in Rectangle class
	  //calculatePerimeter() is a concrete method after overriding
	  }
	 
	  public int getLength() {
	  return length;
	  }
	 
	  public void setLength(int length) {
	  this.length = length;
	  }
	 
	  public int getWidth() {
	  return width;
	  }
	 
	  public void setWidth(int width) {
	  this.width = width;
	  }
	 
	  // Rectangle class is overriding super class method display()
	  //In overriding, the parameters in superclass method and
	  //subclass method must match
	  public void display() { //method overriding
	  System.out.print("Length=" + length + " Width=" +width + " ");
	  super.display();
	  }
	 
	  //class fields
	  protected int length, width;
	  }
	 
	  //final subclass of Rectangle.
	  final class Cuboid extends Rectangle{
	  Cuboid(int length,int width,int height){ //parameterized constructor
	  super(length, width); //super class members must be initialized in
	  //super class only
	  this.height=height;
	  }
	 
	  public int getHeight() {
	  return height;
	  }
	 
	  public void setHeight(int height) {
	  this.height = height;
	  }
	 
	  public int calculateVolume(){ //reuse of code is happening here
	  return length * width * height;
	  }
	 
	  //override super class method
	  public void display() {
	  //super.display(); //display() of Rectangle class will be called
	  System.out.print("Length=" + length + " Width=" +width
	  + " Height=" + height + " Volume="+calculateVolume());
	  }
	  
	   //class field
	   int height;
	   }
	  
	   //since Cuboid is a final class, you can not subclass it further
	   /*
	   class XYZ extends Cuboid{ // This is wrong and should not happen
	  
	   }
	   */

