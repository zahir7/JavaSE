package test.mypac;

public class BankMain2 {
	
	public static void main(String[] args) {
		Bank bank=new Bank("종로 지점");
		//예금하기
		bank.setMoney(10000);
		bank.setMoney(5000);
		
		//예금한 돈 찾기
		int returnedMoney = bank.getMoney(8000);
		
		System.out.println("인출한 돈:"+returnedMoney);
	}
}
