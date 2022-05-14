
/* Program : To demonstrate the use of Wrapper classes
* Program By : Anil Donwade
* Date : 18-Oct-2021
*/

/*
* The Wrapper classes wraps a value of the respective primitive type in an object.
* In addition, this class provides several methods for converting a primitive to
* a String and a String to an primitive, as well as other constants and methods.
* Below program demonstrates the use of wrapper class Integer.
*
* Similar wrapper classes are:
* Byte
* Short
* Long
* Float
* Double
* Character
* Boolean
*/

package wrappers;

public class WrapperDemo {

	public static void main(String[] args) {
		
		Integer intObject = Integer.valueOf(25); //int literal (primitive) is
		//getting converted to Integer type
		
		int x = Integer.parseInt("100"); // string is getting converted to
		// primitive type int
		
		int y = intObject.intValue(); // getting int (primitive) wrapped
		// in Integer object
		
		System.out.println("Sum of " + x + " and " + y + " is: "+(x+y));
		
		int z = Integer.max(x, y);
		System.out.println("The maximum of " + x + " and " + y + " is: "+ z );
		
		//using command line arguments
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		
		int sum = Integer.sum(number1, number2);
		System.out.println("Sum=" + sum);

	}

}
