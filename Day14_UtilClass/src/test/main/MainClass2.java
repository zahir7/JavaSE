package test.main;

import java.util.Calendar;

/*
 * [[ Calendar Class ]] 
 */
public class MainClass2 {
	public static void main(String[] args) {
		//Calendar 객체의 참조값 얻어오기
		Calendar calNow=Calendar.getInstance();
		int year=calNow.get(Calendar.YEAR); //년
		
		System.out.println("올해:"+year);
		int month=calNow.get(Calendar.MONTH)+1;//월
		System.out.println(month+"월");
		
		int day=calNow.get(Calendar.DAY_OF_MONTH);
		System.out.println(day+"일");
		
		int hour=calNow.get(Calendar.HOUR);
		int min=calNow.get(Calendar.MINUTE);
		int sec=calNow.get(Calendar.SECOND);
		
		System.out.println(hour+" : "+min+" : "+sec);
	}
}












