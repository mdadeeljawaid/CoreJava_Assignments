package interfaces;

//Implementation class: 2nd Implementation of MyLoopInterface
public class MyLoopImpl implements MyLoopInterface {

	//here repeatTask() method is implemented by using while loop
		@Override
		public void repeatTask(int n) {
			System.out.println("\nRepeating task using while loop");
			int x=0;
			while(x<n) {
				System.out.println(x+1);
				x++;
			
			}
	}

		public static void main(String[] args) {
			
			//instantiate implementation class using interface reference
			MyLoopInterface m = new MyLoopImpl();
			
			m.repeatTask(25);	//call interface method, which is implemented in MyLoopImpl
			
			//instantiate implementation class using interface reference
			m = new MyLoopImplementation();
			
			m.repeatTask(20);	//call interface method, which is implemented in MyLoopImplementation

		}

	}
