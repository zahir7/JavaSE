package test.main;

import test.mypac.Car;

public class MainClass01 {
	
	static String myName="�豸��";
	
	public static void main(String[] args) {
		//Car ��ü �����ϱ�.
		Car car1=new Car();
		//new Car().drive();
		car1.drive();
		car1.drive();
		System.out.println(myName);
		doSomething();
	}
	//�ɹ� �޼ҵ� �߰� �ϱ�.
	public static void doSomething(){
		System.out.println("���𰡸� �ؿ�!");
	}
}














