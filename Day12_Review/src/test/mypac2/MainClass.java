package test.mypac2;

public class MainClass {
	
	public static void main(String[] args) {
		//HandPhone 객체 생성하기.
		HandPhone phone1=new HandPhone();
		Phone phone2=new HandPhone();
		Object phone3=new HandPhone();
		
		//형변환(casting) 하기
		HandPhone p= (HandPhone)phone3;
	}
}













