package test.mypac3;

public class Phone {
	//�ɹ��ʵ�(��������)
	private Usim usim;
	//public Phone(){}
	//������
	public Phone(Usim usim){
		//�ڽ� �����ڿ��� ���޹��� Usim ��ü�� �ɹ� �ʵ忡 �����ϱ�.
		this.usim=usim;
		System.out.println("Phone() ������");
	}
	//�޼ҵ�
	public void call(){
		if(usim==null){
			System.out.println("Usim ��ü�� ��� ��ȭ�� �ɼ� �����");
			return;//�޼ҵ带 ������
		}
		System.out.println("��ȭ�� �ɾ��!");
	}
}
