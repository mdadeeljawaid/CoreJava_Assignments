package assignment6;

public class InvalidDateException extends Exception{

	public InvalidDateException() {
		super("Date is Invalid ");
	}

	public InvalidDateException(String message) {
		super(message);
	}
}