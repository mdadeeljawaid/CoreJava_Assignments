package assignment6;

public class InvalidDataFormat extends Exception {

	public InvalidDataFormat() {
		super("Data format is invalid");
	}
	public InvalidDataFormat(String message) {
		super(message);
	}
}