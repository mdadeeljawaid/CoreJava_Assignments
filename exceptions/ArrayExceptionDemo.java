/*
* Program : To make use of throws keyword in a Java program and
* guarding a method call with try-catch blocks to a method
* declaring one ore more exceptions
* Program By : Anil Donwade
* Date : 22-Oct-2021
*/
package exceptions;

public class ArrayExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Program started ..........");
		int[] array = new int[10];
		
		//populate array (fill the array)
		for(int i=0; i<array.length; i++)
			array[i]=(i+1)*10;
		
		array=null;			//..... uncomment to see NullPointerException
		//try block to guard the method call, which can raise an exception
		try {
			displayMinimum(array);
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println(e);
			System.out.println("Event handler is being executed ...........");
			e.printStackTrace();
		}finally {
			System.out.println("Inside finally block .......");
			 }
			
		System.out.println("Program ended ..........");
	}
	//this method is declaring an exception being thrown
		private static void displayMinimum(int[] array) throws ArrayIndexOutOfBoundsException{
			int min=array[0];
			
			//potentially erroneous code
			for(int i=0; i<array.length; i++)
				if(min < array[i+1])
					min = array[i+1];
			
			System.out.println("The minimum is:"+min);
		}

}
