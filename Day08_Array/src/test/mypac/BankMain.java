package test.mypac;

public class BankMain {
	//���α׷��� �����̵Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		//Bank ��ü �����ϱ�
		Bank bank1 = new Bank(); //����Ʈ ������ ȣ���ϸ鼭 ��ü �����ϱ�.
		Bank bank2 = new Bank();
		Bank bank3 = new Bank();
		Bank bank4 = new Bank();
		Bank bank5 = new Bank();
		//Bank ��ü�� �����Ҽ� �ִ� �迭 ��ü �����ϱ�. �� : 5
		Bank[] bankList=new Bank[5];
		//������ �迭�� Bank ��ü ���.
		bankList[0]=bank1;
		bankList[1]=bank2;
		bankList[2]=bank3;
		bankList[3]=bank4;
		bankList[4]=bank5;
		
		bank1.setMoney();
		System.out.println( bank1.name );
		//bank1 ��ü�� name �ʵ��� ���� ����
		bank1.name = "��������";
		System.out.println("������ bank1:"+bank1.name);
		System.out.println("bank2 :"+bank2.name);
		
		
	}
}






























