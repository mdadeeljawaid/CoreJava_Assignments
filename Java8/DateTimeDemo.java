package Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {

	public static void main(String[] args) {
		//create LocateDate instance
		LocalDate locateDate = LocalDate.of(2021, 2, 10);
		LocalDate today = LocalDate.now();
		
		if(locateDate.isBefore(today))
			System.out.println(locateDate + " is before "+today);
		
		LocalDate parsedDate = LocalDate.parse("2021-03-14");
		System.out.println("parsedDate: "+parsedDate);
		
		//create LocalTime instance
		LocalTime time = LocalTime.of(9, 57);
		LocalTime thistime = LocalTime.now();
		
		if(thistime.isAfter(time))
			System.out.println(thistime + " is after "+time);
		
		time = LocalTime.parse("09:57:10");				//HH:MM:SS  OR HH:MM
		System.out.println(time);
		
		//create LocalDateTime instance
		LocalDateTime localDateTime1 = LocalDateTime.of(today, thistime);
		System.out.println(localDateTime1);
		
		LocalDateTime localDateTime2 = LocalDateTime.now();
		
		if(localDateTime2.isAfter(localDateTime1))
			System.out.println(localDateTime2 + " is after "+localDateTime1);
		
		if(localDateTime1.equals(localDateTime2))
			System.out.println(localDateTime1 + " is equal to "+localDateTime2);
		else
			System.out.println(localDateTime1 + " is NOT equal to "+localDateTime2);
	}
}