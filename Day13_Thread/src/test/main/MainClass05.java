package test.main;

import test.mypac.Brother;
import test.mypac.Sister;
import test.mypac.Wallet;

/*
 * �ϳ��� ���� ��ü(Wallet) �� �������� Sister ������� Brother �����忡
 * �����ڷ� �������� ���� �����ϵ��� �ϰ�  ������ �����尡 ������ �� �ݾ��� 
 * ����غ���
 * 
 */
public class MainClass05 {
	public static void main(String[] args) {
		//Wallet ��ü �����ϱ�
		Wallet wallet=new Wallet();
		//Sister ������ ��ü ����
		Sister sister=new Sister(wallet);
		//Brother ������ ��ü ����
		Brother brother=new Brother(wallet);
		//������ ��ü�� �̿��ؼ� �ΰ��� ������ ���۽�Ű��
		sister.start();
		brother.start();
		System.out.println("���ν����尡 ����˴ϴ�.");
	}
}










