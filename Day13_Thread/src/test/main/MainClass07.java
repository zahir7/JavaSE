package test.main;

import test.mypac.InterThread;

public class MainClass07 {
	public static void main(String[] args) {
		
		//InterThread iThread=new InterThread();
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("새로운 스레드가 시작되었습니다.");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {}
				System.out.println("새로운 스레드가 종료됩니다.");
			}
		}).start();
		
		System.out.println("메인 스레드가 종료됩니다.");
	}
}





