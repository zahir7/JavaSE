package day5_2;

public class CellPhone implements Phone{
	
	public void sendMsg(){
		System.out.println("���ڸ� ������");
	}

	@Override
	public void call() {
		System.out.println("��ȭ�� �ɾ��");
		
	}
	
}
