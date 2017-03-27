package test.main;

import test.mypac.Member;

public class MainClass1 {
	public static void main(String[] args) {
		//Member 객체 생성하기
	 	Member mem = new Member();
	 	//메소드 호출하고 리턴되는 정수값을 변수에 담기
	 	int num = mem.getNum();
	 	//정수값을 출력하기.
	 	System.out.println("num:"+num);
	 	
	 	//Member 객체 생성하기.
	 	Member mem1 = new Member(1,"김태호","노량진");
	 	int num1=mem1.getNum();
	 	System.out.println("num:"+num1);
	}
}



































