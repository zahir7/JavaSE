package test.mypac;
/*
 * 0~9 ���� 1�ʿ� �ѹ��� ���� ������
 */
public class CountThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}//for
		System.out.println("CountThread ����!");
	}//run()
}
