package test.main;

import test.mypac.InterThread;

public class MainClass07 {
	public static void main(String[] args) {
		
		//InterThread iThread=new InterThread();
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("���ο� �����尡 ���۵Ǿ����ϴ�.");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {}
				System.out.println("���ο� �����尡 ����˴ϴ�.");
			}
		}).start();
		
		System.out.println("���� �����尡 ����˴ϴ�.");
	}
}





