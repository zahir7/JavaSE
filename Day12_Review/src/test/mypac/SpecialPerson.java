package test.mypac;

public class SpecialPerson extends Car{
	private String name;
	//������.
	public SpecialPerson(String name){
		this.name=name;
	}
	//�޼ҵ�
	public void goHome(){
		drive();
		System.out.println("���� �Խ��ϴ�.");
	}
}
