package test.mypac;

public class BankMain2 {
	public static void main(String[] args) {
		Bank bank1=new Bank();
		Bank bank2=new Bank();
		Bank bank3=new Bank();
		
		System.out.println("만들어진 Bank 객체의 수:"+Bank.count);
		bank1.setMoney();
		//static 맴버 메소드는 클래스명으로 접근한다.
		Bank.doSomething();
	}
}
