package interfaces;

//Implementation class: 1st Implementation of MyLoopInterface
public class MyLoopImplementation implements MyLoopInterface {

	//here repeatTask() method is implemented by using for loop
	@Override
	public void repeatTask(int n) {
		System.out.println("Repeating task using for loop");
		for(int i=0; i<n; i++) {
			//task: display number
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		MyLoopImplementation myLoopImplementation = new MyLoopImplementation();
		myLoopImplementation.repeatTask(20);

	}

}
