package test.main;

import test.mypac.MyThread;
/*
 * [[ ���ο� �����带 ���۽�Ű�� ��� ]]
 * 
 * 1.Thread ��ü�� �����Ҽ� �ִ� Ŭ������ ���� �Ѵ�
 * 2.������ Ŭ������ �̿��ؼ� ��ü�� �����Ѵ�.
 * 3.������ ��ü�� start() �޼ҵ带 ȣ���Ѵ�.
 */
public class MainClass01 {
	
	//���� �������� ������
	public static void main(String[] args) {
		System.out.println("���� �����尡 ���۵Ǿ����ϴ�.");
		//MyThread ��ü �����ϱ�
		MyThread thread1=new MyThread();
		thread1.start(); //������ ����
		
		try {
			Thread.sleep(2000); //2�� ���Ŀ�
		} catch (InterruptedException e) {}
		//������ ��ü��  run() �޼ҵ尡 �����ϸ� ���� �Ҽ� �����Ƿ�
		//���� ��ü�� �����ؼ� �����带 �����ؾ��Ѵ�.
		new MyThread().start();
		
		System.out.println("���� �����尡 ����˴ϴ�.");
	}
}










