package exceptions;

public class Account {
	//parameterized constructor
	public Account(String name, float balance ) {
		this.balance = balance;
		this.name = name;
	}
	
	//deposit
	public void deposit(float amount) {
		balance+=amount;
	}
	
	//withdraw
	public void withdraw(float amount) 
			throws InsufficientBalanceException {
		
		
		if(balance <= amount) //no withdrawal
			throw new InsufficientBalanceException("Withdraw amount "
					+ amount + "is greater than balance amount:"+balance);
			//throw new InsufficientBalanceException();
		//throw new MyException("MyException");
			else
			balance-=amount;
	}
	
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", name=" + name + "]";
	}

	//class fields
	float balance;
	String name;
}