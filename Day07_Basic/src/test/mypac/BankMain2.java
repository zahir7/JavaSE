package test.mypac;

public class BankMain2 {
	
	public static void main(String[] args) {
		Bank bank=new Bank("���� ����");
		//�����ϱ�
		bank.setMoney(10000);
		bank.setMoney(5000);
		
		//������ �� ã��
		int returnedMoney = bank.getMoney(8000);
		
		System.out.println("������ ��:"+returnedMoney);
	}
}
