package test.mypac;
/*
 *  [[ ������ ����� ���2]
 *  
 *  1.Runnable �������̽��� implements �� Ŭ������ �����Ѵ�
 *  2.���� Ŭ������ �̿��ؼ� ��ü�� ��������
 *  3.Thread Ŭ������ �̿��ؼ� ��ü�� �����ϸ鼭 ���ڷ� ������ ���� ��ü�� 
 *  	�����Ѵ�.
 *  4.Thread ��ü�� �������� �̿��ؼ� start()�޼ҵ带 ȣ���Ѵ�.
 */
public class InterThread implements Runnable{

	@Override
	public void run() {
		System.out.println("InterThread �� ���۵Ǿ����ϴ�.");
		try {
			Thread.sleep(2000); //2�� ����.
		} catch (InterruptedException e) {}
		System.out.println("InterThread �� ����˴ϴ�.");
	}
	
}
















