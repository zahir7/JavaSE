package test.main;

public class MainClass05 {
	static int number=100;
	
	//���θ޼ҵ� (Method) 
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ尡 ���۵Ǿ����ϴ�.");
		dance();
		System.out.println(number);
		System.out.println("���� �޼ҵ尡 ���� �˴ϴ�.");
	}
	
	public static void dance(){
		System.out.println(number);
		System.out.println("���� ���!");
	}
	
	public static void sing(){
		System.out.println("�뷡�� �ҷ���!");
	}
}
