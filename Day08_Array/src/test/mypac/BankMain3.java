package test.mypac;

public class BankMain3 {
	//프로그램의 시작이 되는 메인 메소드
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
		
		//배열에 저장되어 있는 Bank 객체의 name 필드에 저장된 값 출력하기.
		for(int i=0 ; i < bankList.length ; i++){
			
			String savedName = bankList[i].name;
			System.out.println(i+" 번째 인덱스 name: "+savedName);
		}
		System.out.println("---------------------");
		
		//2번째 인덱스에 있는 객체의 name 필드 값을 바꾼후 출력해보기
		bank3.name="김태호은행";
		//배열에 저장되어 있는 Bank 객체의 name 필드에 저장된 값 출력하기.
		for(int i=0 ; i < bankList.length ; i++){
			
			String savedName = bankList[i].name;
			System.out.println(i+" 번째 인덱스 name: "+savedName);
		}
		
		Bank myBank=new Bank();
		
		Bank yourBank = new Bank();
		
		yourBank.setMoney();
		
		//yourBank = myBank;
	}
}









