package test.main;

public class MainClass14 {
	//���α׷��� ������ �Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		dance();
		dance("���ٴ�");
		dance("���",10);
	}
	
	public static void dance(){
		System.out.println("���� �߾��!");
	}
	public static void dance(String danceName){
		System.out.println(danceName+" �̶� ���� �߾��!");
	}
	public static void dance(String danceName , int num){
		System.out.println(danceName+" ���� "+num+" �� �߾��!");
	}
}







