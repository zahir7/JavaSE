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
		// s의 타입은 S 조상이기때문에 조상의 x만 참조할 수 있다.
		// 조상이 오버라이딩 메서드를 쓰기위해 다형성을 사용한다.
		S s = new A(); 
//		S s = new S();
		s.add();
		System.out.println(s.x);
		
	}
}
