package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		String str="����ȣ";
		test(str);
		System.out.println(str);
		
		Integer num=100;
		System.out.println(num);
		test(num);
		System.out.println(num);
	}
	//�޼ҵ�
	public static void test(String str){
		str = "ȫ�浿";
	}
	public static void test(Integer n){
		n++;
	}
}














