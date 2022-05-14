/*
* Program : To demonstrate the use of LinkedList collection class
* Program by : Anil Donwade
* Date : 23-Oct-2021
*/

/*
* LinkedList is an indexed collection allowing duplicate values, with
* backward traversing capability
*/
package collectionsframework;

import java.util.ArrayList;
//import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
//import java.util.Iterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		//instantiate an arraylist
		LinkedList<String> countriesListTwo = new LinkedList<String>();		// initial capacity is 10
		
		//populate / fill the LinkedList
		ArrayList<String> countriesList = new ArrayList<String>();
		
		//List<String> list = ArrayListDemo.countriesList;
		countriesList.add("Germany");
		countriesList.add("Japan");
		countriesList.add("France");
		countriesList.add("USA");
		countriesList.add("India");
		
		//create a linked list from existing collection
		countriesListTwo.addAll(countriesList);
		
		System.out.println(countriesListTwo.size());
		//display LinkedList using enhanced for
		for(String country : countriesListTwo)
			System.out.println(country);

		ListIterator<String> listIterator = countriesListTwo.listIterator();
		
		System.out.println("Forward traversing:");
		while(listIterator.hasNext())
			System.out.println(listIterator.next());
		
		if(listIterator.previousIndex()>=4) {
			System.out.println("previous elemets are present  . . ");
			while(listIterator.hasPrevious())
				System.out.println(listIterator.previous());
		}
		
		listIterator.remove(); 		//removes the last element
		
		System.out.println("Forward traversing:");
		while(listIterator.hasNext())
			System.out.println(listIterator.next());
		
		//remove all elements from the list
				countriesListTwo.clear();
				if(!countriesListTwo.isEmpty()) {
					System.out.println("Forward traversing:");
					while(listIterator.hasNext())
						System.out.println(listIterator.next());
				}
				else 
					System.out.println("List is empty");
				
				LinkedList<String> allContinents = countriesListTwo;
				
				//asian countries
				String[] asianCountries =  {"India", "Japan", "South Koria", "China"};
				fillLinkedList(allContinents, asianCountries);		//populate
				
				System.out.println("All countries list:");
				displayLinkedList(allContinents);					//display
				
				//European countries
				String[] europeanCountries =  {"Spain", "France", "Germany", "Italy"};
				fillLinkedList(allContinents, europeanCountries);		//populate
				
				System.out.println("All countries list:");
				displayLinkedList(allContinents);					//display
				
				//Australian countries
				String[] austreliaCountries =  {null, null, null, null};
				fillLinkedList(allContinents, austreliaCountries);		//populate
				
				System.out.println("All countries list:");
				displayLinkedList(allContinents);					//display
				
				String country="India";
				searchCountry(allContinents, country);
				//if(allContinents.contains("India")	)
				//	System.out.println("India is present in the list of all countries.");
				
				country="Mexico";
				searchCountry(allContinents, country);
				
				country=allContinents.get(7);
				System.out.println("Country at 7th index:"+country);
				
	}
				//method to search for given country
				private static void searchCountry(LinkedList<String> allContinents, String country) {
					if(allContinents.contains( country)	)
						System.out.println(country + " is present in the list of all countries.");
					else
						System.out.println(country + " is NOT present in the list of all countries.");
				}

				//display linked list content
				private static void displayLinkedList(LinkedList<String> countries) {
					ListIterator listIterator = countries.listIterator();
					
					while(listIterator.hasNext())
						System.out.println(listIterator.next());
				}

				//fill the linked list with array content
				private static void fillLinkedList(LinkedList<String> countriesList, String[] countries) {
					
					for(int i=0; i<countries.length; i++)
						countriesList.add(countries[i]);
	
	}
			

}