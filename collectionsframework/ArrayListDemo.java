package collectionsframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) throws InterruptedException {
		
		countriesList.add("Germany");
		countriesList.add("Japan");
		countriesList.add("France");
		countriesList.add("USA");
		countriesList.add("India");
		
		System.out.println(countriesList.size());
		
		countriesList.add(5, "Spain");
		countriesList.add(6, "Brazil");
		countriesList.add(7, "Canada");
		countriesList.add(8, "China");
		countriesList.add(9, "Urugway");
		
		System.out.println(countriesList.size());
		
		countriesList.add(5, "Ukrain");		//element gets inserted in arraylist
		//arrayList.add(new Employee());
		
		countriesList.add("Mexico");
		
		countriesList.add("Japan"); //once gain same element added
		
		//obtain the iterator
		Iterator<String> itr=  countriesList.iterator();

		//traverse the list using iterator, itr to display countries
		while(itr.hasNext())
			System.out.println(itr.next());
	}
	//class field
	//instantiate an arraylist
	static ArrayList<String> countriesList
	= new ArrayList<String>(); // initial capacity is 10
}