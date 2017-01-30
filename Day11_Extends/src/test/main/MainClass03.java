package test.main;

import test.mypac.Man;
import test.mypac.Woman;

public class MainClass03 {
	public static void main(String[] args) {
		//Man 객체 생성해서 Object 형태로 받기
		Object man=new Man();
		//Woman 형태로 형변환이 가능할까요?
		Woman man2=(Woman)man; // Exception 발생.
	}
}
