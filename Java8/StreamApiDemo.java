package Java8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamApiDemo {

	public static void main(String[] args) {
		//create array list of words
		ArrayList<String> words = new ArrayList<>();
		words.add("FIRST");
		words.add("SECOND");
		words.add("THIRD");
		words.add("FOURTH");
		words.add("FIFTH");
		words.add("SIXTH");
		words.add("SEVENTH");
		
		//obtain a stream of objects from the array list
		Stream<String> stream = words.stream();
		
		//stream processing:
		//perform non-terminal and terminal operations on the stream
		long count = stream.map( ( w )->{
			return w.toLowerCase();
			}).count();
		
		//display the result of stream processing
		System.out.println("count of words :"+count);
		
		//you have to obtain steam again for next operation
		//once processed stream can not be processed again
		 stream = words.stream();
		 count = stream.count();
		 System.out.println("count of words :"+count);
		 
		//display words which are converted to lower case
		 System.out.println("Displaying words which are converted to lower case");
		 stream = words.stream();
		 stream.map(( w )->{return w.toLowerCase();})
			   .forEach((w)->{System.out.println(w);});
		 
		//display words which are converted to lower case,
		 //and starting with "F"
		 System.out.println("Displaying words which are converted to lower case and starting with F");
		 stream = words.stream();
		 stream.filter(( w )->  w.startsWith("F"))
		 	   .map(( w )->{return w.toLowerCase();})
			   .forEach((w)->{System.out.println(w);});
		 }
	}
