package test.main;

import test.mypac.MyUtil;
import test.mypac.MyUtil.HelloPrinter;

public class MainClass02 {
	public static void main(String[] args) {
		//MyUtil 클래스안에 있는 HelloPrinter 클래스를 이용해서 객체 생성
		MyUtil.HelloPrinter p=new MyUtil.HelloPrinter();
		//메소드 사용하기.
		p.printHello();
		//MyUtil 클래스안에 있는 Calculator 클래스를 이용해서 객체 생성한후
		//메소드를 사용해보세요!
		MyUtil.Calculator c=new MyUtil.Calculator();
		c.calc(10, 20);
		
		String name = MyUtil.HelloPrinter.NAME;
		
		System.out.println(name);
	}
}







