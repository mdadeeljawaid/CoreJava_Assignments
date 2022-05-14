package assignment7;

import java.util.*;

public class LegacyClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<String> vec=new Vector<String>();
		int n;
		System.out.println("Enter the number of Strings you want: ");
		n=sc.nextInt();
		System.out.println("Enter "+n+" Strings: ");
		for(int i=0;i<n;i++)
		{
			vec.add(sc.next());
		}

		Enumeration<String> data=vec.elements();
		while(data.hasMoreElements())
		{
			System.out.println(data.nextElement());
		}

	}

}
