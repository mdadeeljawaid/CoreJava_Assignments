/*
* Program : To make use of static import in a Java program
* Program By : Anil Donwade
* Date : 22-Oct-2021
*/
/*
* With the help of static import, we can access the static members of a class
* directly without class name or any object
*/
package interfaces;

import static java.lang.System.out; // import a static member 'out' of System class
import static java.lang.Math.*; // import all static members from Math class

public class StaticImportDemo {

	public static void main(String[] args) {
		out.println("Good Afternoon !");//you don't have to write System class
		//while using out.println()
		int x = 10;
			out.println(pow(x, 3)); //without writing Math class we can use pow()..
				out.println(random()*100);//.. random() method to get number in range 1-99
					out.println(sin(PI/2)); //.. sin() method along with constant PI
						out.println(cos(PI/2));
							out.println(abs(-45));
	}
}