package test.mypac4;

public class HandPhone extends Phone{
	
	public HandPhone(Usim usim){
		//�θ� Ŭ������ �����ڸ� ȣ���ϸ鼭 �ʿ��� ���ڸ� �����Ѵ�.
		super(usim);
		System.out.println("HandPhone()");
	}
	//�޼ҵ�
	public void mobileCall(){
		System.out.println("�̵��߿� ��ȭ�� �ؿ�!");
	}
}	
