package test.main;

public class CarUserMain2 {
	public static void main(String[] args) {
		//Car ��ü �����ؼ� car1 �̶�� ������ ���.
		Car car1 = new Car();
		
		String carColor = car1.color;
		System.out.println(carColor);
		
		//car1 ��ü�� �ʵ� ������ �ٲ��ش�.
		car1.color = "�Ķ���";
		
		//carColor = car1.color;
		//System.out.println("���� �ٲ���:"+carColor);
		System.out.println("���� �ٲ���:"+car1.color);
		//Car ��ü �����ؼ� car2 ��� ������ ���
		Car car2 =new Car();
		System.out.println(car2.color);
		car1.power=20;
		
		System.out.println("car1 ��ü:"+car1.power);
		System.out.println("car2 ��ü:"+car2.power);
	}
}







