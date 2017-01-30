package test.mypac4;

public class HandPhone extends Phone{
	
	public HandPhone(Usim usim){
		//부모 클래스의 생성자를 호출하면서 필요한 인자를 전달한다.
		super(usim);
		System.out.println("HandPhone()");
	}
	//메소드
	public void mobileCall(){
		System.out.println("이동중에 전화를 해요!");
	}
}	
