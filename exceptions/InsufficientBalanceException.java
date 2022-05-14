package exceptions;

//Class definition for an user-defined exception class
public class InsufficientBalanceException extends Exception {
	//parameterized constructor
	public InsufficientBalanceException(String message){
		super(message);
	}
	
	//default constructor
	public InsufficientBalanceException(){
		super("Insufficient Balance");
	}
}