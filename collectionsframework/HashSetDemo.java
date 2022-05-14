/*
* Program : To demonstrate the use of HashSet collection class
* Program by : Anil Donwade
* Date : 23-Oct-2021
*/

/*
* HashSet is a collection with unique elements, NOT allowing duplicate values, with
* no guarantee of maintaining entry order.
*
* Main use of HashSet is to search an object using a hashing technique of searching
*/
package collectionsframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
/*
 * HashSet collection is used to store unique collection of objects
 * and is mostly used for searching object
 */
public class HashSetDemo {

	public static void main(String[] args) {
		//Instantiate HashSet
		HashSet<String> hashSet = new HashSet<>();
		
		//populate / fill the LinkedList
		ArrayList<String> countriesList = new ArrayList<String>();
		
		//List<String> list = ArrayListDemo.countriesList;
		countriesList.add("Germany");
		countriesList.add("Japan");
		countriesList.add("France");
		countriesList.add("USA");
		countriesList.add("India");
		
		//create HashSet using existing collection
		hashSet.addAll(countriesList);
		
		hashSet.add("Japan");
		
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		String country = "France";
		searchCountry(hashSet, country);
		
		country = "Mexico";
		searchCountry(hashSet, country);
		
		//LinkedHashSet maintains an entry order
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("Germany");
		linkedHashSet.add("Japan");
		linkedHashSet.add("France");
		linkedHashSet.add("USA");
		linkedHashSet.add("India");
		
		iterator = linkedHashSet.iterator();
		
		System.out.println("LinkedHashSet elements:");
		while(iterator.hasNext())
		System.out.println(iterator.next());
	}
		
	//method to search a country
	private static void searchCountry(HashSet<String> countriesList, String country  ) {
		if(countriesList.contains(country))
			System.out.println(country+" is in the set of contries.");
		else
			System.out.println(country+" is NOT in the set of contries.");
	}

}