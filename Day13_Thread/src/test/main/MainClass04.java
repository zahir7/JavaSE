package test.main;

import test.mypac.SayThread;

public class MainClass04 {
	public static void main(String[] args) {
		//SayThread ��ü �����ϰ� �����ϱ�
		new SayThread().start();
		System.out.println("���� �޼ҵ尡 ����˴ϴ�.");
	}
}
