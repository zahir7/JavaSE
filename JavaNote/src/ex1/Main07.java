package ex1;

/*
 * 익명 클래스
 * - 이름이 없는 클래스
 * - 스스로 객체 생성을 할 수 없다.
 * - 클래스 상속과 인터페이스 구현중 한가지만 가능
 * - 반듯이 오버라이딩 해야됨
 * - 선언과 동시에 생성 다형성으로 
 * - 일회용 클래스라고 생각하면된다.
 */

interface Test07{
	public static final int x = 100;
	public abstract void add();
}
class A07 implements Test07{
	public void add(){
		
	}
}
public class Main07 {
	public static void main(String[] args){
		//Test07 t  = new A07();			 // 다형성 조상의 참조형으로 오버라이딩 객체생성
		Test07 t = new Test07(){
			public void add(){
				//...
			}			
		};			
	}
}
