package assignment6;

import java.util.Date;
import java.text.DateFormat;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BookIssueReturn {

	public static void main(String[] args) throws InvalidDateException, InvalidReturnDateException {

		Date issueDate = null, returnDate = null;
		String date1 = null, date2 = null;
		Scanner sc = new Scanner(System.in);
		DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");

		System.out.println("Enter the date of issue in dd/mm/yyyy format: ");
		date1 = sc.next();

		if(!date1.matches("[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}")) {
			sc.close();
			throw new InvalidDateException("Issue date is invalid");
		}

		System.out.println("Enter the date of return in dd/mm/yyyy format : ");
		date2 = sc.next();

		if(!date2.matches("[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}")) {
			sc.close();
			throw new InvalidDateException("Return date is invalid");
		}
		sc.close();

		try {
			issueDate = dateFormat.parse(date1);
			returnDate = dateFormat.parse(date2);
		} catch(ParseException e) {
			e.printStackTrace();
		}

		if(issueDate.after(returnDate))
			throw new InvalidReturnDateException ("Return date must be after the issue date");

		System.out.println("Issue Date : " + dateFormat.format(issueDate));
		System.out.println("Return Date : " + dateFormat.format(returnDate));
	}
}