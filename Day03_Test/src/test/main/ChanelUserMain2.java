package test.main;

import test.mypac.ChanelBag;

public class ChanelUserMain2 {
	//프로그램의 시작이 되는 메인 메소드
	public static void main(String[] args) {
		
		ChanelBag myBag=new ChanelBag();
		myBag.setItem("지갑");
		myBag.setItem("핸드폰");
		myBag.setItem("담배");
		myBag.setItem("껌");
		myBag.setItem("커피");
		myBag.setItem("쓰레기");
		//출력해보기
		System.out.println(myBag.items[0]);
		System.out.println(myBag.items[1]);
		System.out.println(myBag.items[2]);
		myBag.setItem("커피");
		myBag.setItem("쓰레기");
		
	}
}
