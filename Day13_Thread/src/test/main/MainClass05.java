package test.main;

import test.mypac.Brother;
import test.mypac.Sister;
import test.mypac.Wallet;

/*
 * 하나의 지갑 객체(Wallet) 을 생성한후 Sister 스레드와 Brother 스레드에
 * 생성자로 전달한후 돈을 인출하도록 하고  각각의 스레드가 인출한 총 금액을 
 * 출력해보자
 * 
 */
public class MainClass05 {
	public static void main(String[] args) {
		//Wallet 객체 생성하기
		Wallet wallet=new Wallet();
		//Sister 스레드 객체 생성
		Sister sister=new Sister(wallet);
		//Brother 스레드 객체 생성
		Brother brother=new Brother(wallet);
		//각각의 객체를 이용해서 두개의 스레드 시작시키기
		sister.start();
		brother.start();
		System.out.println("메인스레드가 종료됩니다.");
	}
}










