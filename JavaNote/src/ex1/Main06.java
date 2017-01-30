package ex1;
class A06{
	void add(){
		int x = 100;		
	}
	void sum(){
		class B06{
			void add(){
				System.out.println("inner class");
			}
		}
		B06 b = new B06();
		b.add();
	}
}
public class Main06 {
	public static void main(String[] args) {
		A06 a = new A06();
		a.sum();
	}

}
