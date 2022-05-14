package inner.bank;

//import inner.bank.BankAccount.InterestCalculator;

//enclosing class
public class BankAccount2 {
	public static void main(String[] args) {
		System.out.println("Program started......");
		BankAccount bankAccount = new BankAccount("Ajay", 10000.00f);
		System.out.println("Program ended ...... ");	
	}
	
	public BankAccount2(String name, float balance) {
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
	String name;
	float balance;
	
	//Inner class : Since private, from outside can no be accessed
		private class InterestCalculator{
			
			public InterestCalculator(float rate) {
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


