package test.mypac3;

public class HandPhone extends Phone{
	//생성자
	public HandPhone(Usim usim){
		super(usim); //부모생성자 호출하는 방법
		System.out.println("HandPhone() 생성자");
	}
	//메소드
	public void mobileCall(){
		System.out.println("이동중에 전화를 걸어요!");
	}
	
}
