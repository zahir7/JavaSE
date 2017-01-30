package test.main;

import java.util.Random;

public class MainClass03 {
	public static void main(String[] args) {
		//랜덤한 수를 발생 시키기 위해서
		Random ran = new Random();
		int ranNum = ran.nextInt(45)+1;
		System.out.println("랜덤으로 생성된 수:"+ranNum);
		//75~100 
		ranNum=ran.nextInt(26)+75;
		// -25 ~ + 25
		ranNum=ran.nextInt(51);
		
	}
}
