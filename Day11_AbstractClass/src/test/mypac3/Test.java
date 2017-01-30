package test.mypac3;

public class Test {
	public String name;
	public void c(){}
	
	public class InnerClass{
		public void a(){
			System.out.println(name);
			c();
		}
	}
	public class InnerClass2{
		public void b(){
			c();
		}
	}
}
