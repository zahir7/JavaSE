package study20120222;

public class OverloadingDemo {
	public void print(int a){
		System.out.print(a);
	}
	
	public void print(String msg){
		System.out.print(msg);
	}
	
	public void print(double d){
		System.out.print(d);
	}
	
	public void test(String... args){
		
		for(String temp : args){
			System.out.println(temp);
		}
	}
	public void test(String arg){
		System.out.println("test");
	}
	
	public static void main(String[] args) {
		OverloadingDemo o = new OverloadingDemo();
		o.test("111");
		o.test("111","2222");
		o.test("111","2222","3333");
	}
	
	
	
}
