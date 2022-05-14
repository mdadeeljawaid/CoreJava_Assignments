package banking;

public class Bank {

	//constructor
	public Bank(int n, int initialBalance) {
		accoutnts = new int[n];
		
		//initialize balance of each account
		for(int i=0; i<n; i++)
			accoutnts[i]=initialBalance;
		
		//initialize counter for counting number of transaction to zero
		nTransactions=0;
	}
	
	//method to transfer the amount
	public  void transfer(int from, int to, int amount) {
		//if(accoutnts[from] < amount) return;
		
		synchronized(this){
			try {
				while(accoutnts[from] < amount)
					wait();				//... further statements will not be executed
										//    till the balance of this account becomes more than amount
							
				//update balances of both accounts involved in the transfer 
				accoutnts[from]-=amount;
				accoutnts[to]+=amount;
		
				notifyAll();			//. .  . notification can happen from other threads which are not waiting
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		nTransactions++;				//increment transfer count
		if(nTransactions % 10000 == 0) 
			showStatus();				//check the total amount in the bank
	}
	
	public void showStatus() {
		int sum=0;
		
		//calculate the total amount in the bank
		for(int i=0; i<accoutnts.length; i++)
			sum+=accoutnts[i];
		//display the total amount in the bank
		System.out.println("Transactions:"+ nTransactions + " Total Balance="+sum);
	}
	
	//class fields
	int[] accoutnts; 
	int nTransactions;
}