package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		String str="±èÅÂÈ£";
		test(str);
		System.out.println(str);
		
		Integer num=100;
		System.out.println(num);
		test(num);
		System.out.println(num);
	}
	//¸Ş¼Òµå
	public static void test(String str){
		str = "È«±æµ¿";
	}
	public static void test(Integer n){
		n++;
	}
}














