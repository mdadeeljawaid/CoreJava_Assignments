package inner;

//enclosing class
public class ArrayMinMax {

	//static inner class
	public static class Pair {
		
		//constructor
		public Pair(int minimum, int maximum) {
			super();
			this.minimum = minimum;
			this.maximum = maximum;
		}

		//method to decide minimum and maximum from the array
		private static Pair minMax(int[] array) {
			Pair temp = null;
			
			int min=array[0];		//initialize minimum
			int max=array[0];		//initialize maximum
			
			//loop to 
			for(int i=0; i<array.length-1; i++){
				//if next number is less than minimum then replace minimum with array[i+1]
				if(array[i+1] < min )
					min = array[i+1];
				
				//if next number is greater than maximum then replace maximum with array[i+1]
				if(array[i+1] > max )
					max = array[i+1];
			}
			
			//instantiate Pair with min, max values
			temp = new Pair(min, max);
			
			//return Pair instance
			return temp;
		}
		@Override
		public String toString() {
			return "Pair [minimum=" + minimum + ", maximum=" + maximum + "]";
		}

		//class fields
		int minimum, maximum;
	}

	public static void main(String[] args) {
		//create integer array
		int[] array = {45, 12, 56, 78, 33, 29, 71, 90, 84, 62};
		
		//invoke method to find out minimum, maximum from the array
		Pair pair = Pair.minMax(array);
		
		//display minimum and maximum
		System.out.println(pair);
	}
}
