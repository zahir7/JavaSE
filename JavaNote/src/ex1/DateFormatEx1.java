package ex1;

import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormatEx1 {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf1, sdf2;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		sdf2 = new SimpleDateFormat("yy년  MMM dd일 E요일");				
				
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
	}
}
