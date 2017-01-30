package test.main;

import test.mypac.Memory;

public class MainClass4 {
	public static void main(String[] args) {
		//Memory 객체 생성하기
		Memory mem1=new Memory("Samsumg",100);
		Memory mem2=new Memory("LG",200);
		
		String brand="SONY";
		int size=300;
		Memory mem3=new Memory(brand,size);
		
		System.out.println(mem1.getCompany());
		System.out.println(mem2.getCompany());
		System.out.println(mem3.getCompany());
	}
}











