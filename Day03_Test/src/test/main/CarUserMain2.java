package test.main;

public class CarUserMain2 {
	public static void main(String[] args) {
		//Car 객체 생성해서 car1 이라는 변수에 담기.
		Car car1 = new Car();
		
		String carColor = car1.color;
		System.out.println(carColor);
		
		//car1 객체의 필드 내용을 바꿔준다.
		car1.color = "파란색";
		
		//carColor = car1.color;
		//System.out.println("색을 바꾼후:"+carColor);
		System.out.println("색을 바꾼후:"+car1.color);
		//Car 객체 생성해서 car2 라는 변수에 담기
		Car car2 =new Car();
		System.out.println(car2.color);
		car1.power=20;
		
		System.out.println("car1 객체:"+car1.power);
		System.out.println("car2 객체:"+car2.power);
	}
}







