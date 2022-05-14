package generics;

public class GenericSwap {

	public static void main(String[] args) {
		Integer[] tArray = new Integer[2];
		
		tArray[0]=Integer.valueOf(100);		
		tArray[1]=Integer.valueOf(200);
		
		System.out.println("\nArray values before & after call to swap():");	//1
		display(tArray);
		swap(tArray);
		display(tArray);
		
		Float[] tArrayFloat = {Float.valueOf(78.89f), Float.valueOf(23.99f)};	//2
		System.out.println("\nArray values before & after call to swap():");
		display(tArrayFloat);
		swap(tArrayFloat);
		display(tArrayFloat);
	
		Double[] tArrayDouble = {Double.valueOf(78.89), Double.valueOf(23.99)};
		System.out.println("\nArray values before & after call to swap():");	//3
		display(tArrayDouble);
		swap(tArrayDouble);
		display(tArrayDouble);
		
		Long[] tArrayLong = {Long.valueOf(7889L), Long.valueOf(2399L)};
		System.out.println("\nArray values before & after call to swap():");	//4
		display(tArrayLong);
		swap(tArrayLong);
		display(tArrayLong);
		
		Short[] tArrayShort = {Short.valueOf((short) 78), Short.valueOf((short) 23)};
		System.out.println("\nArray values before & after call to swap():");	//5
		display(tArrayShort);
		swap(tArrayShort);
		display(tArrayShort);
		
		Byte[] tArrayByte = {Byte.valueOf((byte) 78), Byte.valueOf((byte) 23)};
		System.out.println("\nArray values before & after call to swap():");	//6
		display(tArrayByte);
		swap(tArrayByte);
		display(tArrayByte);
	}

	private static <T >void display(T[] tArray) {
		for(int i=0; i<tArray.length;i++)
			System.out.print(tArray[i] + " ");
		System.out.println();
	}

	//Generic swap() method
	public static <T> void swap(T[] tArray) {
		T temp;
		temp = tArray[0];
		tArray[0]=tArray[1];
		tArray[1]=temp;
	}
	
	/*
	public static <T> void swap(int[] tArray) {
		int temp;
		temp = tArray[0];
		tArray[0]=tArray[1];
		tArray[1]=temp;
	}
	*/
}