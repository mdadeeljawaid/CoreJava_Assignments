/*
 * Program		: To create multiple threads by extending Thread class
 */
package multithreading;
public class SimpleThread extends Thread{

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main() started ..........");
		Thread t1 = new SimpleThread("first");
		Thread t2 = new SimpleThread("second");
		
		t1.start();
		t2.start();
		
		/*
		t1.run();
		t2.run();
		*/
		t1.join();
		if(t1.isAlive())
			System.out.println("t1 is alive......");
		else
			System.out.println("t1 is NOT alive ......");
		
		if(t2.isAlive())
			System.out.println("t2 is alive......");
		else
			System.out.println("t2 is NOT alive ......");
		
		t2.join();			//this means main thread waits till t2 finishes
		
		
		System.out.println("main() stopped ..........");
	}
	
	SimpleThread(String threadName){
		super(threadName);
	}
	
	//override run() method from Thread
	public void run() {
		String threadName=null;
		for(int i=0; i<10; i++) {
			
			//wait for 1 sec
			try {
				threadName = Thread.currentThread().getName();
				if(threadName.equals("first")) {
					System.out.println("First thread: i="+(i+1));
					Thread.sleep(1000);
				}else
					if(threadName.equals("second")) {
						System.out.println("Second thread: i="+(i+1));
						Thread.sleep(2000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}