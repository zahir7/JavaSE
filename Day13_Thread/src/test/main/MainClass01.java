package test.main;

import test.mypac.MyThread;
/*
 * [[ 새로운 스레드를 시작시키는 방법 ]]
 * 
 * 1.Thread 객체를 생성할수 있는 클래스를 정의 한다
 * 2.정의한 클래스를 이용해서 객체를 생성한다.
 * 3.생성된 객체의 start() 메소드를 호출한다.
 */
public class MainClass01 {
	
	//메인 스레드의 시작점
	public static void main(String[] args) {
		System.out.println("메인 스레드가 시작되었습니다.");
		//MyThread 객체 생성하기
		MyThread thread1=new MyThread();
		thread1.start(); //스레드 시작
		
		try {
			Thread.sleep(2000); //2초 쉰후에
		} catch (InterruptedException e) {}
		//스레드 객체는  run() 메소드가 리턴하면 재사용 할수 없으므로
		//새로 객체를 생성해서 스레드를 시작해야한다.
		new MyThread().start();
		
		System.out.println("메인 스레드가 종료됩니다.");
	}
}










