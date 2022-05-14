package assignment6;

public class InvalidReturnDateException extends Exception{

	public InvalidReturnDateException() {
		super("Return Date is Invalid");
	}

	public InvalidReturnDateException(String message) {
		super(message);
	}
}
