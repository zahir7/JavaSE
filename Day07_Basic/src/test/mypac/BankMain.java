package test.mypac;

import java.util.Random;

public class BankMain {
	public static void main(String[] args) {
		//Bank ��ü�� �����غ�����. (���� ����)
		// ��ü ���� new ������;
		Bank bank1 = new Bank("���� ����");
		Bank bank2 = new Bank("���� ����");
		
		bank1.setMoney(1000);
		bank2.setMoney(500);
		
		Bank bank3 = bank1;
		bank3.setMoney(800);
		
		bank2.setMoney(1000);
	}
}







