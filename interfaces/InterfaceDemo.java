package interfaces;

public class InterfaceDemo {

	public static void main(String[] args) {
		MyLoopInterface m = null;
		
		m = new MyLoopImplementation();
		m.repeatTask(7);
		
		m = new MyLoopImpl();
		m.repeatTask(7);
		
		m = new AnotherLoopImpl();
		m.repeatTask(7);

	}

}
