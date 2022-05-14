package collectionsframework;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class LegacyDemo {

	public static void main(String[] args) {
		//vectorDemo();			//growable array
		//stackDemo();			//LIFO structure
		proprtiesDemo();		//hashtable , whre key & value both are string
}

	private static void proprtiesDemo() {
		Properties systemProperties = null;
		
		//obtain system properties
		systemProperties = System.getProperties();
		
		//obtain keys
		Enumeration<Object> keyEnumeration = systemProperties.keys();
		
		//iterate keys and obtain value for each key in individual iteration
		while(keyEnumeration.hasMoreElements()) {
			String key = (String)keyEnumeration.nextElement();	//obtain key
			String value = (String)systemProperties.get(key);	//obtain key
			
			//display key and value pair of a system property
			System.out.println(key + ": "+ value);
		}
		
		
		//obtain the enumeration property names 
		Enumeration enumeration = systemProperties.propertyNames();
		
		//loop to cycle through the enumeration and obtain the property value 
		//to display property name alongwith property value 
		while(enumeration.hasMoreElements()) {
			Object key = enumeration.nextElement();
			String value = systemProperties.getProperty((String)key);
			System.out.println(key+": "+ value);
		}
	}

	private static void stackDemo() {
		temperaturStack= new Stack<Float>();
	
		//populate the stack
		for( Float t: temperaturs)
			temperaturStack.add(t);
		
		//pop all values from the stack and display
		System.out.println("Popped all values from the stack.");
		while(! temperaturStack.empty())
			System.out.println(temperaturStack.pop());
	}

	
	
	private static void vectorDemo() {
		temperaturs = new Vector<>();
		
		temperaturs.add(22.45f);
		temperaturs.add(32.14f);
		temperaturs.add(27.20f);
		temperaturs.add(29.41f);
		temperaturs.add(30.42f);
		
		//display  vector content before sorting
		System.out.println("Display vector content before sorting:");
		for(Float t: temperaturs)
			System.out.print (t+" ");
		
		temperaturs.sort(null);
		
		Float[] f1Array=null, fArray = new Float[temperaturs.size()];
		
		f1Array = temperaturs.toArray(fArray);
		
		//display newly formed array
		System.out.println("\nDisplay sorted vector content after taking"
				+ "array from it :");
		for(Float f: f1Array)
			System.out.print(f+" ");
	}
		
	//class fields
	static Vector<Float> temperaturs;
	static Stack<Float> temperaturStack;
	}