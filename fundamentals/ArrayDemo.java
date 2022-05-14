package fundamentals;

public class ArrayDemo {

	public static void main(String[] args) {
		//declare an array with initialization
		int[] intArray = {10,20,30,40,50,60};
		
		for(int i=0; i<intArray.length; i++)
			System.out.print(intArray[i]+ " ");
				System.out.println();

		//declare a 2D array with initialization
	int [] [] int2DArray = {
			{10,20,30},
			{40,50,60},
			{70,80,90}
			};
	
	System.out.println("\nTwo Dimensional Array:");
	
	for(int i=0; i<int2DArray.length; i++) {
		// for rows
		for(int j=0; j<int2DArray[i].length; j++)
			// for columns
			System.out.print(int2DArray[i][j]+ " ");
				System.out.println();
		}
	}
}