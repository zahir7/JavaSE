package day05;

import day05.app.AbstractEx01;

/*
	추상클래스
		미완성 클래스.
		
	abstract class 클레스명{
		추상메소드
		abstract 리턴타입 메소드명(인자){
		
		}
	}
*/


public class MainEx01 extends AbstractEx01{
	
	public static void main(String[] args) {
		
	}

	@Override
	public void test3() {
		test1();
		test2();
	}
	
}
