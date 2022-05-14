/*
* Program : To create and use an user-defined exception class
* Program By : Anil Donwade
* Date : 22-Oct-2021
*/
/*
* Classes used in this application class
* 1. Account - an entity class
* 2. InsufficientBalanceException - an exception class
*/
package exceptions;

public class AccountApplication {

	public static void main(String[] args) {
		//instantiate Account class
		Account account = new Account("Ajay", 10000);
		try {
		account.deposit(2000);
		System.out.println(account);
		
		account.deposit(4000);
		System.out.println(account);
		
		account.deposit(3000);
		System.out.println(account);
		
		account.withdraw(7000);
		System.out.println(account);
		
		account.withdraw(7000);
		System.out.println(account);
		
		account.deposit(1000);
		System.out.println(account);
		
		account.withdraw(7000);			//-- exception --
		System.out.println(account);
		
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
			//System.out.println(e);
			//e.printStackTrace();
		}
	}
}