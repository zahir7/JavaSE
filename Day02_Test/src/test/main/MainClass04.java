package test.main;
/*
 * [[기본 자료형]]
 * 
 * char => 하나의 문자를 저장할수 있다.
 * 
 * char 변수명 = '가' ;
 */
public class MainClass04 {
	//프로그램의 시작이 되는 메인 메소드
	public static void main(String[] args) {
		//char 형 변수 선언하고 값 대입하기.
		char ch1 = '김';
		char ch2 = '구';
		char ch3 = '라';
		//출력해보기
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		System.out.println("-------");
		
		System.out.print(ch1);
		System.out.print(ch2);
		System.out.print(ch3);
		
		System.out.println("-------");
		
		System.out.println(ch1+""+ch2+""+ch3);
	}
}










