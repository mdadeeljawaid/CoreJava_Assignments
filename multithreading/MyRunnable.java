/*
 * Program 		: To demonstrate the creation of a thread class by implementing 
 * 						the Runnable interface 
 * 
 * Program	By 	: Anil Donwade	
 * Date			: 28-Oct-2021
 */
package multithreading;

import java.util.ArrayList;

public class MyRunnable implements Runnable {

	//parameterized constructor
		public MyRunnable(int from, int to) {
			super();
			this.from = from;
			this.to = to;
			
			//instantiate arraylists
			primeList1 = new ArrayList<>();
			primeList2 = new ArrayList<>();
		}
		
		@Override
		public void run() {
			int n=from;			//loop initialization
			while(true) {		//endless loop
				if(isPrime(n)) {
					//System.out.print(n+" ");
					if(Thread.currentThread().getName().equals("first"))
						primeList1.add(n);
					else if(Thread.currentThread().getName().equals("second"))
						primeList2.add(n);
				}
				n++;
				if(n > to) break;
			}
		}

		private boolean isPrime(int n) {
			int d=2;
			if(n<=1) return false;
			
			do {
				if(n % d == 0) return false;
				d++;
			}while(d<n);
			
			return true;
		}

		public static void main(String[] args) {
			//create Runnable reference
			Runnable runnable1 = new MyRunnable(1, 200);	//step-1
			
			//pass Runnable reference to Thread class constructor
			Thread thread1 = new Thread(runnable1, "first");//step-2
			thread1.start();								//step-3
			
			Runnable runnable2 = new MyRunnable(200, 400);	//step-1
			
			//pass Runnable reference to Thread class constructor
			Thread thread2 = new Thread(runnable2, "second");
			thread2.start();
			
			//make main thread to wait till second thread finishes
			try {
				thread2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			MyRunnable.display();	//invoke method to display all primes
		}

		private static void display() {
			for(Integer num : primeList1)
				System.out.print(num+" ");
			System.out.println();
			
			for(Integer num : primeList2)
				System.out.print(num+" ");
		}

		//class fields
		int from, to;
		static private ArrayList<Integer> primeList1, primeList2;
	}
