package assignment8;

/* Ques2. WAP to implement Singleton Design Pattern
 * (you have define a class for which only one object creation is possible)
 * Think and implement
 */

class SingleObjectClass{
	//static int count = 0
	static SingleObjectClass classObject;
	
	private SingleObjectClass() {
		System.out.println("Object created");
	}
	
	public static SingleObjectClass createObject() {
		if (classObject == null)
			classObject = new SingleObjectClass();
		return classObject;
	}
	public void display() {
		System.out.println("Display from singleton class");
	}
}
public class Singleton {
	
	public static void main(String[] args) {
		SingleObjectClass class1;
		class1 = SingleObjectClass.createObject();
		class1.display();
		
		SingleObjectClass class2;
		class2 = SingleObjectClass.createObject();
		class2.display();
	}
	

}