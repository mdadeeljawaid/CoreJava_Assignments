package generics;

public class GenericsDemo {

	public static void main(String[] args) {
		String[] words = {new String("Laptop"), "Keyboard", "HDD", "Monitor"};					//array of 4 integer Strings
		Integer[] integers = {new Integer(100), new Integer(45), new Integer(76)};	//array of 3 integer objects
		Float[] floats = {45.45f, 78.12f, 992.22f, 68.23f};							// auto-boxing
		
		int n=100;						//primitive type
		Integer m = new Integer(100); 	//reference type / abstract-data type / Wrapper class
		
		//displayWords(words);
		//displayIntegers(integers);
		
		display(words);			//string
		display(integers);		//integer
		display(floats);		//float
	}

	//generic method
	private static <T> void display( T[] array) {					// 1
		System.out.println("Array contents are as follows: ");
		for(T t: array)
			System.out.println(t);
	}
	
	private static void displayIntegers( Integer[] integers) {					// 2
		for(Integer i: integers)
			System.out.println(i);
	}
	
	private static void displayWords(String[] words) {					// 3 - generic method
		for(String s: words)
			System.out.println(s);
	}
}