package test.main;

import test.mypac.ChanelBag;
import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartHandPhone;

public class MainClass01 {
	
	//프로그램의 시작이 되는 메인 메소드
	public static void main(String[] args) {
		//SmartHandPhone 객체 생성하기
		Object obj = new SmartHandPhone();
		Phone phone = new SmartHandPhone();
		HandPhone handphone = new SmartHandPhone();
		SmartHandPhone smart = new SmartHandPhone();
		
		SmartHandPhone smart2 = (SmartHandPhone)obj;
		smart.mobileCall();
	}
}







