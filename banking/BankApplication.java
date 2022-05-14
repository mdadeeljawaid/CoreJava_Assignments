package banking;

public class BankApplication {

	public static void main(String[] args) {
		final int MAX_AMOUNT=10000;
		final int TOTAL_ACCOUNTS=10;
		final int INITIAL_BALANCE=10000;
		//create a unsynchronized Bank object
		//BankUnsync bank = new BankUnsync(TOTAL_ACCOUNTS, INITIAL_BALANCE);
		Bank bank = new Bank(TOTAL_ACCOUNTS, INITIAL_BALANCE);
		
		//loop to create 10 threads to transfer amount
		for(int i=0; i<10; i++) {
			//create a thread
			TransferThread t = new TransferThread(bank, i, MAX_AMOUNT);
			
			//set priority of the thread
			t.setPriority(Thread.NORM_PRIORITY + i % 2);  // odd numbered thread have value 6					 			 	      // even numbered thread have value 5
			//start the thread
			t.start();
		}
	}
}