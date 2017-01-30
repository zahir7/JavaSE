package study20120228;

abstract class Super1{
	int a = 10;
	public void m1(){
		System.out.println("Super1 m1()");
	}
	public abstract void m3();
}


class Sub extends Super1{
	int b = 20;
	public void m2(){
		System.out.println("Sub m2()");
	}
	@Override
	public void m3() {
		System.out.println("Sub m3()");
	}
}
public class ClassCastingDemo {
	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.b = 30;
		sub.a = 40;
		sub.m2();
		sub.m1();
		
		Super1 sup = new Sub();
		
		//sup.b = 30;
		sup.a = 40;
		//sup.m2();
		sup.m1();
		sup.m3();
	}
}

class AA{
	static class B{
		
	}
	class BB{
		
	}
	public void m(){
		AA.B a = new AA.B();
		
		AA.BB aa = new AA().new BB();
	}
}


















