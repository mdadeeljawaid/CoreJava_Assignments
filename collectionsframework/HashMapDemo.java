package collectionsframework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		//Instantiate HashMap 
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1001, "India");						// auto-boxing
	//	hashMap.put(Integer.valueOf(1001), "India");	// without auto-boxing
		
		hashMap.put(1002, "Japan");
		hashMap.put(1003, "USA");
		hashMap.put(1004, "Argentina");
		hashMap.put(1005, "France");
		
		//value-based search 
		System.out.println(hashMap.containsValue("USA"));
		
		//key-based search 
		System.out.println(hashMap.containsKey(1004));
		
		//searching value based on key
		System.out.println(hashMap.get(1004));

		//obtain collection of keys
		Set<Integer> keys = hashMap.keySet();
		
		Iterator<Integer> itr = keys.iterator();
		Integer key=null;
		
		//loop to display key-value pair
		/*while(itr.hasNext()) {
			key=itr.next();
			System.out.println( key+ " "+ hashMap.get(key));
		}*/
		
		System.out.println("Diplaying whole hash map at once:");
		System.out.println(hashMap);
		
		Collection<String>	collection = hashMap.values();
	
		if(!collection.isEmpty()) {
			//iterate to display values only
			Iterator<String> itrator=collection.iterator();
			
			//display all values
			while(itrator.hasNext())
				System.out.println(itrator.next());
		}
		//add duplicate key. Key can can not be duplicated, but we can change value for the same key
				hashMap.put(1004, "South Koria");	
				hashMap.put(null, "Yugoslavia");	
				String removedCountry = hashMap.put(null, "Egypt");			//no two nulls are allowed
				System.out.println("removed Country :"+removedCountry);
				
				hashMap.put(1006, null);			//null value with valid key is allowed
				//hashMap.put(null, null);
				
				System.out.println(hashMap);
		
	}
}