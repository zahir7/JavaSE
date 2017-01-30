package study20120222;

public class MethodDemo {
	public void m1(){
		this.m2();
		MethodDemo.m3();
		MethodDemo.m4();
	}
	public void m2(){
		
	}
	public static void m3(){
		MethodDemo m = new MethodDemo();
		m.m1();
		m.m2();
		m4();
	}
	public static void m4(){
		
	}
}
