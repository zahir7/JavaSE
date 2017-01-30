package test.mypac;
/*
 * [[ 스레드 객체를 생성하기위한 클래스 ]]
 * 
 * 1.Thread 클래스를 상속받는다
 * 2.run()메소드를 오버라이딩한다.
 */
public class MyThread extends Thread{
	
	@Override
	public void run() {
		//새로운 스래드의 실행순서가 된다.(스레드본체)
		System.out.println("MyThread 만의 작업을 해요!");
		System.out.println("MyThread 가 종료 됩니다.");
	}
}
