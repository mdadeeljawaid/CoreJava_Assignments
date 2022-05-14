
/*
* Program : To demonstrate the usage of the methods of StringBuffer class
* Program By : Anil Donwade
* Date : 19-Oct-2021
*/
/*
* StringBuffer is thread safe, hence in multi-threaded application
* it is better choice.
* It provides guaranteed synchronization for mutable string and
* hence it is threadsafe.
* Due to synchronization speed of execution becomes little slower
*/
package fundamentals;

public class StringBufferDemo {
	//stringBuffer : "COMPUTER PROGRAMMING"
	public static void main(String[] args) {
		// instantiate StringBuffer to get mutable string
		StringBuffer stringBuffer = new StringBuffer("COMPUTER");
		
		//add few more strings at the end of the existing mutable string
		stringBuffer.append(" ");
		stringBuffer.append("PROGRAMMING USING JAVA IS VERY SIMPLE");
		System.out.println(stringBuffer);
		
		//Knowing capacity & length of StringBuffer
		//also, ensuring more capacity
		System.out.println("The current capacity of stringBuffer is: " +stringBuffer.capacity());
		System.out.println("length: "+stringBuffer.length());
		stringBuffer.ensureCapacity(200);
		System.out.println("The current capacity of stringBuffer is: " +stringBuffer.capacity());
		
		//deleting part of existing string
		StringBuffer sb = stringBuffer.delete(stringBuffer.indexOf("USING"),
		stringBuffer.indexOf("IS"));
		System.out.println(sb);
		
		//inserting a new string in existing string
		int offset = sb.indexOf("IS");
		sb.insert(offset, "USING JAVA ");
		System.out.println(sb);
		
		//even we can append number or any other primitive data to StringBuffer
		sb.append(100);
		System.out.println(sb);

	}

}
