package test.mypac;
/*
 * [[ ������ ��ü�� �����ϱ����� Ŭ���� ]]
 * 
 * 1.Thread Ŭ������ ��ӹ޴´�
 * 2.run()�޼ҵ带 �������̵��Ѵ�.
 */
public class MyThread extends Thread{
	
	@Override
	public void run() {
		//���ο� �������� ��������� �ȴ�.(�����庻ü)
		System.out.println("MyThread ���� �۾��� �ؿ�!");
		System.out.println("MyThread �� ���� �˴ϴ�.");
	}
}
