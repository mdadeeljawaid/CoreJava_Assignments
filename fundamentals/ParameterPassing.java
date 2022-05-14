/*
* Program : To demonstrate the effect of passing various types of parameters
* to methods in Java
* Program By : Anil Donwade
* Date : 22-Oct-2021
*/
package fundamentals;
/*
* IMPORTANT: In Java all types of parameters are always passed by value.
*
* When we pass primitives, or reference type to method then modifications made to
* primitive parameters or reference parameters are not reflected in calling method
*
* When an object reference is passed as a parameter then that method can change
* the object state and this changed object state is reflected in calling method.
*
* Hence array is passed as a parameter to swap() method and in that method, when
* numbers are swapped in 1st and 2nd array positions, the array object state is
* changed and this change is reflected back in calling method i.e. in main() method
*/
public class ParameterPassing {

	public static void main(String[] args) {
		int x, y;
		
		//CASE I	: Passing Primitive parameters to method
		x=10;	y=20;
		System.out.println("before swap:x="+x + " and y="+y);
		swap(x, y);
		System.out.println("After swap:x="+x + " and y="+y);
		
		//CASE II	: Passing Reference parameters to method
		Integer num1 = Integer.valueOf(10);
		Integer num2 = Integer.valueOf(20);
		
		System.out.println("before swap: num1="+num1 + " and num2="+num2);
		swap(num1, num2);
		System.out.println("After swap: num1="+num1 + " and num2="+num2);
		
		//CASE III	: Passing Array parameters to method
		int[] intArray = {x, y};
		System.out.println("before swap:x="+intArray[0] + " and y="+intArray[1]);
		swap(intArray);
		System.out.println("After swap:x="+intArray[0] + " and y="+intArray[1]);
	}

	//method to swap primitive values using array
		private static void swap(int[] intArray) {
			int temp;
			
			temp = intArray[0];
			intArray[0] = intArray[1];
			intArray[1] = temp;
			
			System.out.println("In swap() .... x="+ intArray[0] + " and y="+ intArray[1]);
		}

		//method to swap primitive values 
		private static void swap(int x, int y) {
			int temp;
			
			temp = x;
			x = y;
			y = temp;
			System.out.println("In swap() .... x="+x + " and y="+y);
		}
		
		//method to swap values using reference variables
		//we are passing references
		private static void swap(Integer x, Integer y) {
			Integer temp;
			
			temp = x;
			x = y;
			y = temp;
			System.out.println("In swap() .... x="+x + " and y="+y);
		}
	}
