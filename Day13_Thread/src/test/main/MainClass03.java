package test.main;

import test.mypac.CountThread;

public class MainClass03 {
	public static void main(String[] args) {
		//CountThread 객체 생성해서 변수에 담기
		CountThread cThread=new CountThread();
		//변수에 담긴 참조값을 이용해서 스레드 시작시키기
		cThread.start();
		//메인 스레드에서 자신만의 작업하기
		for(int i=0;i<10;i++){
			System.out.println(i*100);
			try {
				Thread.sleep(500); //0.5초씩 쉬기
			} catch (InterruptedException e) {}
		}
		System.out.println("메인 스레드가 종료됩니다.");
	}//main()
}//class





