package test.mypac;

import java.util.Random;

public class BankMain {
	public static void main(String[] args) {
		//Bank 객체를 생성해보세요. (동묘 지점)
		// 객체 생성 new 생성자;
		Bank bank1 = new Bank("동묘 지점");
		Bank bank2 = new Bank("강남 지점");
		
		bank1.setMoney(1000);
		bank2.setMoney(500);
		
		Bank bank3 = bank1;
		bank3.setMoney(800);
		
		bank2.setMoney(1000);
	}
}







