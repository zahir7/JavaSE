package test.main;

public class MainClass17 {
	public static void main(String[] args) {
		String name = getName();
		System.out.println(name);
		//getNumber() ��� �޼ҵ带 ȣ������ ���ϵǴ� �����͸� �޾Ƽ� ���
		//�� ������!
		//int num = getNumber();
		//System.out.println(num);
		System.out.println(getNumber());
		
		System.out.println("���� �޼ҵ尡 ���� �˴ϴ�.");
	}
	
	//���ϵǴ� �����Ͱ� �ִ� �޼ҵ�
	public static String getName(){
		
		return "�۸���!";
	}
	public static int getNumber(){
		
		return 100;
	}
}
