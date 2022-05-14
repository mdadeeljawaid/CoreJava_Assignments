package interfaces;

//3rd implementation of MyLoopInterface
public class AnotherLoopImpl implements MyLoopInterface {

	@Override
	public void repeatTask(int n) {
		System.out.println("Repeating task using do...while loop");
		int y=n;
		do {
			System.out.print(y+"\t");
			y--;
		}while(y>=0);
		}

	}

