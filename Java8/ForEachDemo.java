package Java8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		
		//populate arraylist
		for(int i=0; i<10; i++)
			numList.add(i+1);
		
		//CASE I - Using named class for implementation of interface, Consumer
		Consumer<Integer> action = new ConsumerImpl(); 
		numList.forEach(action);
		
		//CASE II - Using anonymous class for implementation of interface, Consumer
		//create, instantiate and send the object of unnamed Consumer implementation class
		numList.forEach( new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.print(t+" ");
			}
		});
		
		//CASE III - Using lambda expression for implementation of interface, Consumer
		System.out.println();
		numList.forEach( t-> System.out.print(t+"\t") );
	}

}

//named class implementation of Consumer interface
class ConsumerImpl implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
}