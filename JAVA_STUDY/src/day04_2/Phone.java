package day04_2;

/*
 	상속(inherited)
	부모로부터 멤버변수 및 메소드 물려받는것.
	최상위 부모조상은 Object
	
	 클래스명 extends 부모클래스
	
	
	접근제어자
	
	public - 전부다
	protected - 같은 패키지 + 상속
	default(노네임) - 같은패키지
	private - 같은 클래스
 */

// 전화기 객체
public class Phone {
	
	public int numBtn = 12;
	public String op1 = "수화기";
	public String op2 = "전화선";
	
	protected void call(){
		System.out.println("전화를 해요..!");
	}
	
	public void recive(){
		System.out.println("전화를 받아요..!");
	}
	
	
}
