package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;
import test.mypac.Memory;

public class MainClass5 {
	public static void main(String[] args) {
		//Cpu 객체 생성하기
		Cpu cpu1=new Cpu("인텔");
		//Memory 객체 생성하기.
		Memory mem1 = new Memory("삼성",100);
		
		//Computer 객체 2개를 생성해보세요.
		Computer com1=new Computer(cpu1 , mem1);
		
		Computer com2=
				new Computer(new Cpu("인텔"),new Memory("aa",1));
		
		Computer com3=new Computer(null,null);
	}
}










