package test.mypac3;

public class HandPhone extends Phone{
	//������
	public HandPhone(Usim usim){
		super(usim); //�θ������ ȣ���ϴ� ���
		System.out.println("HandPhone() ������");
	}
	//�޼ҵ�
	public void mobileCall(){
		System.out.println("�̵��߿� ��ȭ�� �ɾ��!");
	}
	
}
