package fundamentals;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		int[] intArray = {67, 58, 43, 83, 91, 24, 11, 78, 41, 55};
		Arrays.sort(intArray);
		//display array
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i]+ " ");
		
		System.out.println();
		
		//create sort and display float array
		float[] floatArray = {67.67f, 58.55f, 43.42f, 83f, 91.71f, 24.89f, 11.49f, 78.90f, 41.56f, 55.60f};
		Arrays.sort(floatArray);
		//display array
		for(int i=0; i<floatArray.length; i++)
			System.out.print(floatArray[i]+ " ");
		
		System.out.println();
		
		//display float array in descending order
		for(int i=floatArray.length-1; i>=0; i--)
			System.out.print(floatArray[i]+ " ");

		System.out.println();
		
		//create sort and display String array
		String[] StringArray = {"Adeel", "Nishant", "Prashant", "Siddharth", "Alok"};
		Arrays.sort(StringArray);
		//display array
		for(int i=0; i<StringArray.length; i++)
			System.out.print(StringArray[i]+ " ");
		
		System.out.println();
		
		//create sort and display char array
		/*char[] charArray = {adeel, nishant, prashant, siddharth, alok};
		Arrays.sort(charArray);
		//display array
		for(int i=0; i<charArray.length; i++)
			System.out.print(charArray[i]+ " ");*/
	}

}
