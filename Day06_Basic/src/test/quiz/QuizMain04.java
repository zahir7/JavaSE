package test.quiz;

import java.util.Scanner;

/*
 * Scanner 객체를 이용해서 사용자가 입력한 단에 해당하는 구구단을 출력하세요.
 * 
 * 실행결과
 * 
 * 출력하고 싶은 단을 입력하세요.
 * 2 + enter
 * 
 * 2 * 1 = 2
 * 2 * 2 = 4
 * 2 * 3 = 6
 * .
 * .
 * 2 * 9 = 18
 * 
 * 
 */
public class QuizMain04 {
	public static void main(String[] args) {
		//Scanner 객체 생성하기
		Scanner scan=new Scanner(System.in);
		System.out.println("출력하고 싶은 단을 입력하세요");
		int dan=scan.nextInt(); //정수값 입력받기
		//반복문 돌면서 구구단 출력하기.
		for(int i=1 ; i <= 9 ; i++){
			int result = dan * i;
			System.out.println(dan+" * "+i+" = "+result);
		}
	}
}















