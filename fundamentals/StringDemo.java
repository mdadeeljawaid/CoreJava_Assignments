
/*
* Program : To demonstrate the usage of the methods of String class
* Program By : Anil Donwade
* Date : 19-Oct-2021
*/
package fundamentals;

public class StringDemo {

	public static void main(String[] args) {
		
		//create Strings
		String s1="Computer", s2="Programming";
		int index = 3;
		System.out.println(s1.charAt(index));
		String stemp=s1.concat(" ");
		
		System.out.println(stemp.concat(s2));
		
		System.out.println("Index of character 't' is: "+s1.indexOf('t'));
		System.out.println("Index of word \"put\" is: "+s1.indexOf("put"));
		
		//s1=null; // s1 is nor refereing to any object
		s1="";
		if(s1.isEmpty())
		System.out.println("s1 is empty"+s1);
		 else
		System.out.println("s1 is NOT emplty:"+s1);
		boolean value =false;
		if(! s1.isEmpty())
		 value = checkPalindrome(s1);
		
		s1="Computer";
		if(s1.endsWith("ter"))
		System.out.println(s1 + " ends with " + "ter");
		else
		System.out.println(s1 + " NOT ends with " + "ter");
		
		 s1 = "11:Suresh";
		 String[] array = null;
		 if(s1.matches("[0-9]+:[a-zA-Z]+")) {
		 //split roll no. and name
		 array=s1.split(":");
		
		 //display array content
		 for(int i = 0; i< array.length; i++)
		 System.out.println(array[i]);
		
		 }else
		 System.out.println("String NOT matching the regular expression");
		
		 }
		
		 //method skeleton for checking of palindrome String
		private static boolean checkPalindrome(String s1) {
		boolean flag=false;
		
		if(s1.isEmpty()) return flag;
		 //logic ..
		
		 return flag;
		}
	}

