package test.main;

import java.util.ArrayList;

import test.mypac.Car;

public class MainClass03 {
	
	public static void main(String[] args) {
		//Car ��ü�� ���� ArrayList ��ü �����ϱ�
		ArrayList<Car> carList=new ArrayList<Car>();
		//������ �����迭 ��ü��  Car ��ü �����ؼ� �����ϱ�
		Car car1=new Car("�ƹݶ�");
		Car car2=new Car("�ҳ�Ÿ");
		Car car3=new Car("�׷���");
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(new Car("�����̵�"));
		carList.add(new Car("������"));
		//���� �޸����?
		carList.get(3).drive();
		carList.get(3).name = "New�����̵�";
		carList.get(3).drive();
		
		String carName = carList.get(4).name;
		System.out.println("�о�� ���̸�:"+carName);
		
		//�迭�� ����Ǿ��ִ� ��� ��ü�� drive() ��� �޼ҵ带 ȣ���Ϸ���?
		carList.get(0).drive();
		carList.get(1).drive();
		carList.get(2).drive();
		carList.get(3).drive();
		carList.get(4).drive();
		//�ݺ����� ����ϸ�.
		for(int i=0 ; i < carList.size() ; i++){
			Car tmp=carList.get(i);
			tmp.drive();
		}
		//Ȯ��for���� ����ϸ�
		for(Car tmp : carList){
			tmp.drive();
		}
	}
}














