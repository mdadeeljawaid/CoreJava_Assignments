package Java8;

/*
 Write a program using StreamAPI to display the
 sum of odd numbers only from the numbers in the array  
 list having numbers from 1 to 20.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiOddNumbers {

	public static void main(String[] args) {
		
		/* List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
	    int sum = numbers.stream()
	        .filter(n -> n % 2  == 1)
	        .map(n  -> n)
	        .reduce(0, Integer::sum);

	    System.out.println(sum); */
		
		//addition of odd numbers between 1 to 20
		 ArrayList<Integer> numberList = new ArrayList<>();
		 
		 for(int i=1; i<=20; i++)
			 numberList.add(i);
			 
		 //sum of odd numbers between  1to 20
		 int sum = numberList.stream()
					.filter((n)-> ( n % 2 ) == 1)
					.reduce(0, (s, n) -> s+n);
			System.out.println("\nsum="+sum);
		
		
	}
}