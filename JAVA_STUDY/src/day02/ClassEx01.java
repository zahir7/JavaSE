package day02;


/*
 
 클래스 붕어틀
생성자	 - 객체가 생성될때 반듯이 실행하는 놈.
 변수 - 속성값.
 메소드 - 동작.
 
 알아두면 좋은것?
 클래스 명 첫글자는 대문자.
 
 객체 붕어빵
 변수
 메소드

 접근제어자 
 	public	- 어디서나 불러오고 사용가능
 	protected	- 같은 페키지안 또는 상속자 사용가능.
 	default(아무것도 안쓴것)	- 같은 페키지 안 사용가능
 	private	- 같은 클래스 안에서 만 사용가능

*/

public class ClassEx01 {
	
// 접근제어자, 정적/동적, 리턴타입, 메소드명(매개변수/인자/파라메타)
	public static void main(String[] args) {	// 컨트롤러.. 스케줄러..
//		int resultNum = add(10); // 1 ->10
//		System.out.println("resultNum : "+resultNum);	// 9 -> 10
	}
	
	
	public void public_ex(){
		System.out.println("public");
	}
	
	protected void protected_ex(){
		System.out.println("protected");
	}
	
	void default_ex(){
		System.out.println("default");
	}
	
	private void private_ex(){
		System.out.println("private");
	}
	
	
	
	
	
	

}
