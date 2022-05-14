package Java8;

public class HelloApplication {

	public static void main(String[] args) {
		
		//implementation of HelloInterface using lambda expression
		HelloInterface helloRef = ()-> System.out.println("Hello, Good Morning!!!");
		
		//print a message
		helloRef.sayHello();
	}
}


//functional interface
interface HelloInterface{
	void sayHello();
}