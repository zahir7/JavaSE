package test.main;
//�ٸ� ��Ű���� �ִ� class �� ����ϱ� ����
import test.mypac.ChanelBag;

public class ChanelUserMain {
	//���α׷��� �������� �Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		
		ChanelBag myBag = new ChanelBag();
		ChanelBag myBag2 = new ChanelBag();
		
		myBag.setItem();
		System.out.println("������ ��:"+myBag.color);
		
	}
}
