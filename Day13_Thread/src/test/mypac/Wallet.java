package test.mypac;

public class Wallet {
	public int totalMoney=10000;
	//�޼ҵ�
	public synchronized int getMoney(){
		
		if(totalMoney==0)return 0; 
		totalMoney = totalMoney-1;
		System.out.println("���� ������ �ݾ�:"+totalMoney);
		return 1;
	}
}
