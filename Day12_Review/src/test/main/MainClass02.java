package test.main;

import test.mypac.IRandom;
import test.mypac.Person;

public class MainClass02 {
	public static void main(String[] args) {
		//Person 객체 생성하기
		new Person("김구라").goHome();
		//IRandom 객체 생성하기.
		IRandom ran=new IRandom();
		//생성된 IRandom 객체의 참조값을 이용해서 메소드 호출하기.
		int ranNum=ran.getRandomNum();
		int ranNum2=ran.getRandomNum();

		System.out.println("생성된 랜덤수:"+ranNum);
	}
}
