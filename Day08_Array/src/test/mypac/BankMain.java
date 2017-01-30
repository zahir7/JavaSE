package test.mypac;

public class BankMain {
	//프로그램의 시작이되는 메인 메소드
	public static void main(String[] args) {
		//Bank 객체 생성하기
		Bank bank1 = new Bank(); //디폴트 생성자 호출하면서 객체 생성하기.
		Bank bank2 = new Bank();
		Bank bank3 = new Bank();
		Bank bank4 = new Bank();
		Bank bank5 = new Bank();
		//Bank 객체를 저장할수 있는 배열 객체 생성하기. 방 : 5
		Bank[] bankList=new Bank[5];
		//생성된 배열에 Bank 객체 담기.
		bankList[0]=bank1;
		bankList[1]=bank2;
		bankList[2]=bank3;
		bankList[3]=bank4;
		bankList[4]=bank5;
		
		bank1.setMoney();
		System.out.println( bank1.name );
		//bank1 객체의 name 필드의 값을 변경
		bank1.name = "국민은행";
		System.out.println("변경후 bank1:"+bank1.name);
		System.out.println("bank2 :"+bank2.name);
		
		
	}
}






























