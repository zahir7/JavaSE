package test.main;

import test.mypac.CountThread;

public class MainClass02 {
	//���� �������� ������
	public static void main(String[] args) {
		System.out.println("���ν����尡 ���۵˴ϴ�.");
		//Thread ��ü �����ϰ� ���� ��Ű��
		new CountThread().start();
		//new CountThread().run();
		System.out.println("���� �����尡 ����˴ϴ�.");
	}
}
