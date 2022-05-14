
/*
* Program : To demonstrate the usage of the methods of StringBuilder class
* Program By : Anil Donwade
* Date : 19-Oct-2021
*/

/*
* StringBuilder, is not thread safe, but in single threaded application
* it is better choice, since it faster as compared to StringBuffer
*/
package fundamentals;

public class StringBuilderDemo {
	//StringBuilder is similar to StringBuffer except no guarantee of synchronization
	//Advantage of StringBuilder is that it is more time efficient than StringBuffer
	//in single threaded environment

	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder(); //16 - initial capacity
		System.out.println(stringBuilder.capacity());
		
		stringBuilder.append("Object class is a cosmic super class for all classes in Java.");
		System.out.println("capacity:"+stringBuilder.capacity());
		System.out.println("length:"+stringBuilder.length());
		
		stringBuilder.append(100);
		System.out.println("capacity:"+stringBuilder.capacity());
		System.out.println("length:"+stringBuilder.length());
		
		StringBuilder sbldr = stringBuilder.delete(7, 12);
		System.out.println(sbldr);

	}

}
