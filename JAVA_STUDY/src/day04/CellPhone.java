package day04;

import day04_2.Phone;

// 휴대폰
public class CellPhone extends Phone{
	
	
	@Override
	public void call() {
		super.call();
		System.out.println("무선으로..");
		
	}

	@Override
	public void recive() {
		System.out.println("무선으로..");
		super.recive();
	}
	
	
	
}
