package assignment7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class EmployeeB {

	public static void main(String[] args) {
		ArrayList list=new ArrayList<String>();
		list.add("Adeel");
		list.add("Rahul");
		list.add("Naiyer");
		list.add("Tabish");
		list.add("Saddam");

		HashSet<String> hashset=new HashSet<>();
		hashset.addAll(list);


		Iterator<String> iterator=hashset.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());

	}

}