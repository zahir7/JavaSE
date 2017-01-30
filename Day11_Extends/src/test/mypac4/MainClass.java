package test.mypac4;

public class MainClass {
	public static void main(String[] args) {
		//HandPhone 객체 생성하기
		HandPhone phone=new HandPhone(new Usim());
		phone.call();
	}
}
