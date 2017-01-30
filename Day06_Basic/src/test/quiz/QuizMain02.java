package test.quiz;

import java.util.Random;
import java.util.Scanner;

/*
 * 실행결과
 * 
 * 선택하세요 ( 가위:1,바위:2,보 :3) 
 * 1 + enter
 * 나 : 가위 
 * com : 보
 * 결과 : 이겼습니다.
 * 
 * 선택하세요 ( 가위:1,바위:2,보 :3) 
 * 2 + enter
 * 나 : 바위 
 * com : 바위
 * 결과 : 비겼습니다.
 * 
 * 
 */
public class QuizMain02 {
	public static void main(String[] args) {
		//필요한 객체 생성하기
		
		//숫자를 입력 받기 위해서
		Scanner scan=new Scanner(System.in);
		System.out.println("선택하세요 ( 가위:1,바위:2,보 :3)");
		int userNum=scan.nextInt(); //정수 입력 받는 방법
		
		//랜덤한 수를 발생시키기 위해서
		Random ran=new Random();
		// 1~3 사이의 수중에서 랜덤한수 발생시키기.
		int ranNum=ran.nextInt(3)+1; 
		//가위,바위,보  문자열을 배열에 미리 저장하기
		String[] gameStr={"가위","바위","보"};
		
		String result=null;
		//승부를 판별하기 위해서
		if(userNum==ranNum){ //비긴경우
			result="비겼습니다.";
		}else if(userNum==1 && ranNum==2){ //가위:바위 >>진경우
			result="졌습니다.";
		}else if(userNum==1 && ranNum==3){ //가위:보 >> 이긴경우
			result="이겼습니다.";
		}else if(userNum==2 && ranNum==1){ //바위:가위 >> 이긴경우
			result="이겼습니다.";
		}else if(userNum==2 && ranNum==3){ //바위:가위 >> 진경우
			result="졌습니다.";
		}else if(userNum==3 && ranNum==1){ //보 :가위 >> 진경우
			result="졌습니다.";
		}else if(userNum==3 && ranNum==2){ //보 :바위 >> 이긴경우
			result="이겼습니다.";
		}
		//결과 값 출력하기	
		System.out.println("나: "+gameStr[userNum-1]);
		System.out.println("com: "+gameStr[ranNum-1]);
		System.out.println("결과: "+result);
		
	}
}











