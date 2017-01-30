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
public class QuizMain05 {
	public static void main(String[] args) {
		//Scanner 객체 생성하기
		Scanner scan=new Scanner(System.in);
		while(true){
			System.out.println("출력하고 싶은 단을 입력하세요(종료:0)");
			int dan=scan.nextInt(); //정수값 입력받기
			if(dan==0)break; // 0을 입력하면 종료
			if(dan < 2 || dan > 9 ){
				System.out.println("2~9 사이의 수를 입력하세요");
				continue; //반복문의 처음으로 다시 실행순서를 이동한다.
			}
			//반복문 돌면서 구구단 출력하기.
			for(int i=1 ; i <= 9 ; i++){
				int result = dan * i;
				System.out.println(dan+" * "+i+" = "+result);
			}//for
		}//while
	}
}















