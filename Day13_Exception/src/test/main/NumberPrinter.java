package test.main;

public class NumberPrinter {
	
	public void printNumber() throws InterruptedException{
		//0~9���� 1�ʿ� �ѹ��� ���
		for(int i=0;i<10;i++){
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
