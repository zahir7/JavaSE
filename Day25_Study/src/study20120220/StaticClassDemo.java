package study20120220;

public class StaticClassDemo {
	
	static{
		System.out.println("static initialize");
	}
	public static void main(String[] args) {
		System.out.println(interestRate);
		//BANKNAME = "국민은행";
		System.out.println("main");
		StaticClassDemo s1 = new StaticClassDemo();
		s1.age = 20;
		StaticClassDemo.interestRate = 5.7;
		
		StaticClassDemo s2 = new StaticClassDemo();
		s2.age = 30;
		StaticClassDemo.interestRate = 4.7;
		
		System.out.println(s1.interestRate);
		
	}
	int age;
	static double interestRate;
	static final String BANKNAME = "신한은행";
}
