package study20120228;
class A{
	int a = 10;
	static int aa = 20;
	{
		System.out.println("A instance a : "+a);//5
	}
	static{//1
		aa = 30;
		System.out.println("A static a : "+aa);
	}
	A(){
		System.out.println("A 생성자호출");//6
	}
	
}

class B extends A{
	int b = 10;
	static int bb = 20;
	{
		System.out.println("B instance b : "+b);//7
	}
	static{//2
		bb = 30;
		System.out.println("B static b : "+bb);
	}
	B(){
		System.out.println("B 생성자호출");//8
	}
}

class C extends B{
	int c = 10;
	static int cc = 20;
	{
		System.out.println("C instance c : "+c);//9
	}
	static{//3
		cc = 30;
		System.out.println("C static c : "+cc);
	}
	C(){
		System.out.println("C 생성자호출");//10
	}
}


public class ExtendsDemo extends C{
	public static void main(String[] args) {
		//1,2,3
		System.out.println("main start");//4
		ExtendsDemo c = new ExtendsDemo();
	}
}
