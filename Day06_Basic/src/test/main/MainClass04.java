package test.main;
/*
 * [[ 기본자료형 ]]
 * 3.정수형
 * - 선언하는 방법
 * 	byte 변수명;
 *  short 변수명;
 *  int 변수명;
 *  long 변수명;
 * -표현 가능한 범위가 다르다.
 * byte < short < int < long
 * 
 * -자주 쓰이는 데이터 형: int,byte
 */
public class MainClass04 {
	public static void main(String[] args) {
		//정수형 변수 선언과 동시에 값 대입해보기
		byte iByte=10;
		short iShort=100;
		int iInt=1000;
		long iLong=10000;
		//저장된 값을 문자열로 출력해보기
		System.out.println("byte 형:"+iByte);
		System.out.println("short 형:"+iShort);
		System.out.println("int 형:"+iInt);
		System.out.println("long 형:"+iLong);
	}
}








