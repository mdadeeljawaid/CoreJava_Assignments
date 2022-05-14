package multithreading;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		for(int i=1; i<=10; i++)
			System.out.println("i="+i);
	}

	//main() method
	public static void main(String[] args) {
		//create instance of class implementing Runnable
				RunnableThread r1 = new RunnableThread();
				
				//create threads by passing runnable references
				Thread t1 = new Thread(r1);
				Thread t2 = new Thread(r1);
				
				t1.start();
				t2.start();

	}

}
