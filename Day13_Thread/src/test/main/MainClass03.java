package test.main;

import test.mypac.CountThread;

public class MainClass03 {
	public static void main(String[] args) {
		//CountThread ��ü �����ؼ� ������ ���
		CountThread cThread=new CountThread();
		//������ ��� �������� �̿��ؼ� ������ ���۽�Ű��
		cThread.start();
		//���� �����忡�� �ڽŸ��� �۾��ϱ�
		for(int i=0;i<10;i++){
			System.out.println(i*100);
			try {
				Thread.sleep(500); //0.5�ʾ� ����
			} catch (InterruptedException e) {}
		}
		System.out.println("���� �����尡 ����˴ϴ�.");
	}//main()
}//class





