package test.main;

public class MainClass15 {
	public static void main(String[] args) {
		//�Ʒ��� �ִ� 3���� �ɹ� �޼ҵ带 ���ʷ� ȣ���� ������.
		showMsg();
		showNumber(100);
		calc(10,"����ȣ",10.1);
	}
	
	public static void showMsg(){
		System.out.println("����!!");
	}
	public static void showNumber(int number){
		System.out.println("���ڷ� ���޵� ����:"+number);
	}
	public static void calc(int num,String name,double d){
		System.out.println(num+" "+name+" "+d);
	}
}
