package test.main;
/*
 * [[ 기본 자료형 ]]
 * 2.문자형(char)
 * - 선언하는 방법
 * - char 변수명;
 * 가질수 있는 범위 : 0 ~ 65535
 * 따라서 총 65536 가지의 한글자를 표현할수 있다.
 * 전 세계에서 쓰이는 문자 형태를 대부분 다 표현할수 있다.
 */
public class MainClass02 {
	//프로그램의 시작이 되는 메인 메소드 
	public static void main(String[] args) {
		//char 형 변수 선언과 동시에 값 대입하기
		char ch1 = 'A';
		//출력해보기 
		System.out.println("char 형 변수에 저장된 문자:"+ch1);
		char ch2 = '李';
		char ch3 = '쀍';
		
		int num = ch1; //char 형을 int 형으로 형변환
		System.out.println("대문자 A 에 해당하는 숫자코드:"+num);
		
		int num2= 110;
		char ch4 = (char)num2; //int 형을 char 형으로 강제 형변환
		System.out.println(ch4);
	}
}











