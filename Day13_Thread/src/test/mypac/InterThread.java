package test.mypac;
/*
 *  [[ 스레드 만드는 방법2]
 *  
 *  1.Runnable 인터페이스를 implements 한 클래스를 정의한다
 *  2.만든 클래스를 이용해서 객체를 생성한후
 *  3.Thread 클래스를 이용해서 객체를 생성하면서 인자로 위에서 만든 객체를 
 *  	전달한다.
 *  4.Thread 객체의 참조값을 이용해서 start()메소드를 호출한다.
 */
public class InterThread implements Runnable{

	@Override
	public void run() {
		System.out.println("InterThread 가 시작되었습니다.");
		try {
			Thread.sleep(2000); //2초 쉰다.
		} catch (InterruptedException e) {}
		System.out.println("InterThread 가 종료됩니다.");
	}
	
}
















