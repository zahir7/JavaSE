package test.mypac;

public class Person {
	private String name; //�̸�
	//������
	public Person(String name){
		this.name=name;
	}
	//�޼ҵ�
	public void goHome(){
		Car car=new Car();
		car.drive();
		System.out.println("���� �Խ��ϴ�.");
	}
}
