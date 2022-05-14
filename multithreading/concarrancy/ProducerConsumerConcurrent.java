package multithreading.concarrancy;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

//ProducerConsumer application class
public class ProducerConsumerConcurrent {

	public static void main(String[] args) {
		
		//create shared object by multiple threads
		BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
		
		//instantiate Producer & Consumer threads with shared object
		Producer producer = new Producer(blockingQueue);
		Consumer consumer = new Consumer(blockingQueue);
		
		//start Producer & Consumer threads
		producer.start();
		consumer.start();
	}

	}
		//Producer thread
		class Producer extends Thread{
			
			public Producer(BlockingQueue<Integer> blockingQueue) {
				super();
				this.blockingQueue = blockingQueue;
			}
			
			public void run() {
				int value=1;
				while(true) {
					value=Integer.valueOf(value)+100;
					blockingQueue.add(value);
					System.out.println("value ="+value);
					value++;
					
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						e.printStackTrace();
						
					}
				}
			}
			
			//class fields
			BlockingQueue<Integer> blockingQueue;
		}
		
		//Consumer thread
		class Consumer extends Thread{
			
			public Consumer(BlockingQueue<Integer> blockingQueue) {
				this.blockingQueue = blockingQueue;;
			}
			
			public void run() {
				int x=0;
				while(true) {
					try {
						x = blockingQueue.take();
						System.out.println("x="+x);
						Thread.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			//class fields
			BlockingQueue<Integer> blockingQueue;
		}
