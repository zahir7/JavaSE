package test.main;

import test.mypac.Car;

/*
 * �޼ҵ带 ȣ���ϰų� �����ڸ� ȣ���Ҷ� �����ϴ� ���ڴ� ũ�� 2������ ������ �ִ�
 * 
 * 1. call by value       (��������)
 * 2. call by reference   (�������� ����)
 */
public class MainClass03 {
	//���� �޼ҵ�
	public static void main(String[] args) {
		int num=999;
		//�޼ҵ� ȣ���ϸ鼭 ���� �����Ѵ�.
		test(num); //call by value
		System.out.println(num);
		
		Car car=new Car("��Ʋ�� Cooper");
		System.out.println(car.name);
		test(car);
		System.out.println(car.name);
		
		
	}
	//�߰� �޼ҵ�
	public static void test(int num){
		num++; //���� ���� ��Ų��.
		System.out.println("������Ű��:"+num);
	}
	public static void test(Car car){
		car.name="����";
	}
}











