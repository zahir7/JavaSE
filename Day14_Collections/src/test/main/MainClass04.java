package test.main;

import java.util.Vector;

import test.mypac.Car;

/*
 * [[ Vector Class ]]
 * 
 * -ArrayList �� �޼ҵ尡 �����ϴ�. 
 * -������ ����ȭ�� �����Ѵ�.
 * -ArrayList ���� ���̴�.
 */
public class MainClass04 {
	public static void main(String[] args) {
		//Vector ��ü �����ϱ�
		Vector<Car> vec=new Vector<Car>();
		//������ ��ü�� Car ��ü �����ϱ�
		vec.add(new Car("�ƹ���"));
		vec.add(new Car("�ҳ�Ÿ"));
		//�ݺ��� ���鼭 �޼ҵ� ����غ���
		for(Car tmp:vec){
			tmp.drive();
		}
	}
}