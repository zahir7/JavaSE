package test.mypac3;

public class ComputerMain {
	//���α׷��� ������ �Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		//Computer ��ü �����ϱ�
		Computer com1 = new Computer();
		Computer com2 = new Computer("���� ����ھ�","�Ｚ 4Giga");
		
		//com1 �� com2 ��ü�� �������� �����ϱ��??
		com2.calc();
		
		
	}
}
