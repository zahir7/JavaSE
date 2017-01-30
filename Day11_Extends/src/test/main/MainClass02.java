package test.main;

import test.mypac.Human;
import test.mypac.Woman;

public class MainClass02 {
	public static void main(String[] args) {
		
		//Woman 클래스를 이용해서 객체 생성한후 다양한 형태로 받아보기.
		Woman woman1=new Woman();
		Human woman2=new Woman();
		Object woman3=new Woman();
		woman1.makeup();
		woman2.say();
		woman3.toString();
		//자식 형태로 형변환해서 변수에 담기.
		Woman woman4=(Woman)woman3;
		
	}
}





















