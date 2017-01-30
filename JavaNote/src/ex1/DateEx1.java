package ex1;

import java.util.Calendar;
import java.util.Date;

public class DateEx1 {
	public static void main(String[] args) {
		Date day = new Date();
		System.out.println(day);
		Calendar cal = Calendar.getInstance();
		System.out.println();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	}
}
