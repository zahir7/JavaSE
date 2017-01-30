package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;

public class MainClass05 {
	
	public static void main(String[] args) {
		//HandPhone 객체 생성하기.
		HandPhone phone = new HandPhone();
		HandPhone phone2 = phone; 
		//메소드 사용하기 
		phone.call();
		phone2.call();
		//AndroidPhone 객체 생성하기
		AndroidPhone aPhone=new AndroidPhone();
		aPhone.call();
		aPhone.doInternet();
	
	}
}
