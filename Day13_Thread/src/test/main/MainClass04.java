package test.main;

import test.mypac.SayThread;

public class MainClass04 {
	public static void main(String[] args) {
		//SayThread 객체 생성하고 시작하기
		new SayThread().start();
		System.out.println("메인 메소드가 종료됩니다.");
	}
}
