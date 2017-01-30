package day02;

/*
	생성자(Constructor)
	
	객체가 생성이 될때 한번만 실행됨.
	특징은 이름이 없거나.. 클래스명과 같다.
	생성자명(인자값){
	
	}
	
	생성자는 리턴값이 없어!!!!!!!!!!!!!!!!!!!!!!
	method는 return 있다.
 */

public class Constructior {
	static int a = 10;
	
	{
		a = 100;
		System.out.println("아무개1 생성자");
	}
	
	static {
		a= 200;
		System.out.println("아무개2 생성자");
	}
	
	Constructior(){
		a =300;
		System.out.println("Constructior 기본 생성자 입니다.");
	}

	
	
	
	
	

}
