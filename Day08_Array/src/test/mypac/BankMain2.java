package test.mypac;

public class BankMain2 {
	public static void main(String[] args) {
		Bank bank1=new Bank();
		Bank bank2=new Bank();
		Bank bank3=new Bank();
		
		System.out.println("������� Bank ��ü�� ��:"+Bank.count);
		bank1.setMoney();
		//static �ɹ� �޼ҵ�� Ŭ���������� �����Ѵ�.
		Bank.doSomething();
	}
}
