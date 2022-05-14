package banking;

public class TransferThread extends Thread {

	//TransferThread(BankUnsync bank, int fromAccount, int maxAmount){
	TransferThread(Bank bank, int fromAccount, int maxAmount){
		this.bank = bank;
		this.fromAccount=fromAccount;
		this.maxAmount=maxAmount;
	}
	
	public void run() {
		try {
			while( !interrupted()) {
				int toAccount = (int) (Math.random()*10);	//0 to .9999 => 0 to 9
				int amount = (int)(Math.random()*maxAmount);	//0 to .9999 => 0 9999
				bank.transfer(fromAccount, toAccount, amount);
				sleep(1);
			}
		}catch(InterruptedException e) {
			System.out.println("TransferThread interrupted...");
		}
	}
	
	//class fields
	//BankUnsync bank;		//composition or containment
	Bank bank;
	int fromAccount;
	int maxAmount;
}