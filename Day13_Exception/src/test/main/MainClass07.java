package test.main;

public class MainClass07 {
	public static void main(String[] args) {
		//NumberPrinter ��ü �����ϱ�
		NumberPrinter p=new NumberPrinter();
		
		//�޼ҵ� ����ϱ�
		try {
			p.printNumber();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
