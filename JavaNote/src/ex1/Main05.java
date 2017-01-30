package ex1;
class A05{
	class B05{
		//static int x = 100;
		int y = 200;
	}
}
public class Main05 {
	public static void main(String[] args) {		 
		A05 a = new A05();
		A05.B05 b = a.new B05();
		System.out.println(b.y);
		
		//A05.B05 b = new A05.B05;   //<- static
		
		//System.out.println(A05.B05.x);
		//System.out.println(b.y);		
	}
}