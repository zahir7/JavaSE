package test.main;

import test.mypac.CountThread;

public class MainClass02 {
	//메인 스레드의 시작점
	public static void main(String[] args) {
		System.out.println("메인스레드가 시작됩니다.");
		//Thread 객체 생성하고 시작 시키기
		new CountThread().start();
		//new CountThread().run();
		System.out.println("메인 스레드가 종료됩니다.");
	}
}
