package test.lotto;

import java.util.Random;

// 1~45 의 숫자 중에서 중복되지 않는 수 6개를 뽑아내는 예제

public class LottoMain {
	
	public static void main(String[] args) {
		//정수를 저장할수있는 배열 객체 생성하기 45개의 방
		int[] lottoNum = new int[45];
		
		//반복문 돌면서 각각의 방에 순서대로 숫자 넣어두기
		for(int i=0 ; i < 45 ; i=i+1){
			lottoNum[i] = i+1; 
		}
		//랜덤한 수를 발생 시키기 위해서  Random 객체 생성하기.
		Random ran=new Random();
		//반복문 돌면서 임의로 배열에 저장된 숫자를 섞기(suffle)
		for(int i=0 ; i < 45 ; i=i+1){
			// 0 ~ 44 사이의 정수중 임의의 수 얻어오기.
			int changeIndex = ran.nextInt(45);
			//바꿔야 할 인덱스의 값과 현재 인덱스의 값 자리 바꾸기
			int tmp = lottoNum[i]; //현재 인덱스 값 임시 변수에 저장
			lottoNum[i] = lottoNum[changeIndex];
			lottoNum[changeIndex] = tmp;
		}
		//배열에서  0 ~ 5 번째 인덱스에 저장된값 출력 해 보기
		for(int i=0 ; i < 6 ; i=i+1){
			System.out.print(lottoNum[i]+" / ");
		}
	}
}











