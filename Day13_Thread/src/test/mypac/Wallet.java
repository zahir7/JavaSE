package test.mypac;

public class Wallet {
	public int totalMoney=10000;
	//메소드
	public synchronized int getMoney(){
		
		if(totalMoney==0)return 0; 
		totalMoney = totalMoney-1;
		System.out.println("현재 지갑의 금액:"+totalMoney);
		return 1;
	}
}
