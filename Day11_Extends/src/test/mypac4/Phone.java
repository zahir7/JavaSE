package test.mypac4;

public class Phone {
	//�ɹ� �ʵ� �����ϱ�
	Usim usim;
	//public Phone(){}
	//���ڷ� Usim ��ü�� ���� �޴� ������ �����
	public Phone(Usim usim){
		this.usim=usim;
		System.out.println("Usim ��ü�� �ڽ����� ���� ���� �޾ҽ��ϴ�.");
	}
	//�޼ҵ�
	public void call(){
		if(usim==null){
			System.out.println("��ȭ�� �Ұ����մϴ� Usim ��ü�� �ʿ��մϴ�.");
			return;//�޼ҵ带 ������
		}
		System.out.println("��ȭ�� �ɾ��!");
	}
}
