package test.mypac5;

public class Child extends Parent{
	String name="아이들";
	
	public void play(){
		System.out.println("놀아요!");
	}
	//메소드 오버라이딩 하기
	public void eat(){
		System.out.println("아이가 밥을 먹어요!");
	}
}
