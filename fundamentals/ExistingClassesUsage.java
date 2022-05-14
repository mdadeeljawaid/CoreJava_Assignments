package fundamentals;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ExistingClassesUsage {

	public static void main(String[] args) {
		
		Date date=null; //declare class reference variable
		date = new Date(); //instantiate Date class
		
		System.out.println(date); //display date
		
		Date d1 = new Date(); //today
		@SuppressWarnings("deprecation")
		Date d2 = new Date(2020-1900, 4, 11); //prev date
		
		//a method can only be called using object of that that
		
		if(d1.after(d2))
			System.out.println("d1 is later date than d2");
		else
			System.out.println(d2 +" is later date than"+ d1);
		
		//using Calendar & GregorianCalendar
		Calendar date1 = new GregorianCalendar(); //today's date
		Calendar date2 = new GregorianCalendar(2020, 4,11); //today's date
		
		String date1String = date1.get(Calendar.DAY_OF_MONTH) + "/" + date1.get(Calendar.MONTH) + "/" + date1.get(Calendar.YEAR);
		
		String date2String = date2.get(Calendar.DAY_OF_MONTH) + "/" + date2.get(Calendar.MONTH) + "/" + date2.get(Calendar.YEAR);
				
				//compare dates
				if(date1.after(date2))
				System.out.println(date1String + " is later date than " + date2String);
				else
				System.out.println(date2String +" is later date than "+ date1String);
	}

}
