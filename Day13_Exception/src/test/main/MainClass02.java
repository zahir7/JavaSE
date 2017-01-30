package test.main;

import java.util.Random;

/*
 * [[ 익셉션(Exception) : 예외 ]]
 * -프로그램 실행도중 발생되는 에러에 해당한다.
 * -예외 처리 : 예외가 발생되었을때 이를 처리 하는것
 * -처리하는 방법 :
 * 
 * try{
 * 	실행문장;
 *  .
 *  .
 * }catch(익셉션클래스명   변수명){
 * 	해당 예외가 발생했을경우 실행할 문장 ;
 *  .
 *  .
 * }
 */
public class MainClass02 {
	public static void main(String[] args) {
		//정수값을 저장할 지역변수 초기화 하기
		int num1=10,num2=0,result=0;
		Random ran=null;
		
		try{
			ran.nextInt();
			//연산하기
			result=num1/num2;
			//다음 실행문장
			System.out.println("------------");
		}catch(ArithmeticException ae){
			System.out.println("어떠한 수를 0으로 나눌수 없습니다.");
		}catch(NullPointerException ne){
			System.out.println("null 포인트 익셉션이 발생했습니다.");
		}catch(Exception e){
			System.out.println("예외가 발생했습니다");
		}
		
		//결과값 출력하기
		System.out.println("연산결과:"+result);
	}
}
















