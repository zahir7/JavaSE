package test.main;

import test.mypac.InterThread;

public class MainClass06 {
	public static void main(String[] args) {
		//Runnable �������̽��� ������ ��ü�� �����Ѵ�.
		Runnable iThread=new InterThread();
		//������ ��ü�� Thread ��ü�� �����ϸ鼭 ���ڷ� �����Ѵ�.
		Thread thread=new Thread(iThread);
		//Thread ��ü�� start()�޼ҵ带 ȣ���ϸ� ���ο� �����尡 ���۵ȴ�.
		thread.start();
		
		System.out.println("���� �����尡 ����˴ϴ�.");
	}
}
