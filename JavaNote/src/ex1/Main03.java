package ex1;
interface S{
	int x = 10;
	public abstract void add();
}
class A implements S{
	int x = 20;
	@Override
	public void add() {
		System.out.println("aaaaaa");		
	}
}
class B implements S{
	@Override
	public void add() {
		System.out.println("bbbbbb");		
	}
}
public class Main03 {
	public static void main(String[] args) {
		// s�� Ÿ���� S �����̱⶧���� ������ x�� ������ �� �ִ�.
		// ������ �������̵� �޼��带 �������� �������� ����Ѵ�.
		S s = new A(); 
//		S s = new S();
		s.add();
		System.out.println(s.x);
		
	}
}
