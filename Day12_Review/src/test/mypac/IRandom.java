package test.mypac;

import java.util.Random;

public class IRandom extends Random{
	
	//랜덤한 수를 생성해서 리턴하는 메소드
	public int getRandomNum(){
		//0~9 까지의 수중에서 랜덤한 정수를 생성한다.
		int ranNum=nextInt(10);
		return ranNum;//생성된 정수를 리턴
	}
}
