package test.main;

import test.mypac.Cpu;

public class MainClass3 {
	public static void main(String[] args) {
		//Cpu °´Ã¼ »ý¼ºÇÏ±â
		Cpu cpu1=new Cpu("¼¿·¯·Ð");
		Cpu cpu2=new Cpu("µà¾óÄÚ¾î");
	
		System.out.println(cpu1.getType());
		System.out.println(cpu2.getType());
		
		String str=cpu1.getType();
		System.out.println(str);
	}
}


























