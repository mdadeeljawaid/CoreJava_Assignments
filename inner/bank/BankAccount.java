package inner.bank;

//import inner.bank.BankAccount.InterestCalculator;

//enclosing class
public class BankAccount {
	public static void main(String[] args) {
		System.out.println("Program started......");
		BankAccount bankAccount = new BankAccount("Ajay", 10000.00f);
		System.out.println("Program ended ...... ");
		
		//we can create instance of inner class as follows
		//Syntax:
		//Enclosing Class.InnerClass referenceVariable = enclosingClassRefernce.newInnerClass(...);
				BankAccount.InterestCalculator ic =  bankAccount.new InterestCalculator(10);
				ic.addInterest();
				System.out.println("In 2nd year, 1st quarter . . .");
				System.out.println(bankAccount.name + " has account balance ="+ bankAccount.balance);

	}
	
	public BankAccount(String name, float balance) {
		this.name = name;
		this.balance = balance;
		
		InterestCalculator interestCalculator = new InterestCalculator(10);
		
		//loop to calculate interest & update balance in each quarter
		for(int quarter = 1; quarter<=4; quarter++) {
			//calculate & to add interest to balance
			interestCalculator.addInterest();
			
			//display balance
			System.out.println("Balance after adding interest in Quarter "+ quarter + ": "+ this.balance);
		}
	}

	//class fields
	private String name;
	private float balance;
	
	//Inner class : Since private, from outside can no be accessed
	private class InterestCalculator{
		
		private InterestCalculator(float rate) {
			this.rate = rate;
		}

		//this method is accesing private member of the BankAccount class
		private void addInterest() {
			//System.out.println("addInterest() called .......balance="+balance);
			balance += balance*rate/100;
		}
		
		//class field
		float rate;
	}
	
}

//In this class we can not access the private inner class of BankAccount
/*
class A{
	
	//
	InterestCalculator interestCalculator;
}
*/

