package test.mypac;

import java.util.Scanner;

/*
 * ������ ���� Ŭ���� �����.
 */
public class Bank {
	//final  ��� �����ϱ�
	public final String NAME="��������";
	public String branch; //����
	public int totalMoney; //��ü ��ġ�� �ݾ�
	//������ �����ϱ�
	public Bank(String branch){
		//�����ڿ��� ���ڷ� �޾ƿ� �������� �ڽ��� �ɹ� �ʵ忡 �����ϱ�
		this.branch=branch;
	}
	//�����ϴ� �޼ҵ�
	public void setMoney(int money){
		//totalMoney = totalMoney+money;
		totalMoney += money; //���� ǥ���� �ٿ���
		System.out.println(money+" �� ��ġ �߽��ϴ�.");
		System.out.println(NAME+" "+branch+" �� �ѿ���:"+totalMoney);
	}
	//������ ã�� �޼ҵ�
	public int getMoney(int requestMoney){
		totalMoney = totalMoney - requestMoney;
		if(totalMoney < 0){
			System.out.println("���� �����մϴ�.");
			totalMoney = totalMoney + requestMoney;
			return 0;
		}
		System.out.println(NAME+" "+branch+" �� �ѿ���:"+totalMoney);
		return requestMoney;
	}
}









