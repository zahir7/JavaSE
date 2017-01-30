package study20120220;

public class ClassDemo {
	int age;
	double height;
	String name;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDemo c1 = new ClassDemo();
		c1.age = 10;
		c1.height = 100;
		c1.name = "성영한";
		
		ClassDemo c2 = new ClassDemo();
		c2.age = 20;
		c2.height = 200;
		c2.name = "홍길동";
		
		ClassDemo c3 = c2;
		
		System.out.println(c1 == c2);//false
		System.out.println(c2 == c3);//true
		
		System.out.println(c1.name);
		System.out.println(c1.height);
		System.out.println(c1.age);
		
		System.out.println(c2.name);
		System.out.println(c2.height);
		System.out.println(c2.age);
		
		System.out.println(c3.name);
		System.out.println(c3.height);
		System.out.println(c3.age);
		
	}

}
