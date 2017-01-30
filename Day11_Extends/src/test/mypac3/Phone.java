package test.mypac3;

public class Phone {
	
	//디폴트 생성자 재정의 하기
	public Phone(){
		System.out.println("Phone 클래스의 생성자가 호출되었습니다.");
	}
	//메소드
	public void call(){
		System.out.println("전화를 걸어요!");
	}
}
