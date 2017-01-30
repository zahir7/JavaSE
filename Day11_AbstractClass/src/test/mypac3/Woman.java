package test.mypac3;
/*
 * 추상클래스(Abstract Class) 만들기
 * 
 * -추상클래스에서는 메소드를 정의만하고 구현하지 않은 메소드도 허용이된다.
 * -구현되지않은 추상메소드가 존재할수 있다는 사실을 제외하고는 다른 일반클래스와
 * 형태는 동일하다
 * -추상클래스 단독으로는 객체 생성을 할수가 없다.
 * -만드는 방법 : class 예약어 앞에 abstract 를 붙여준다.
 */
public abstract class Woman {
	//일반 메소드
	public void say(){
		System.out.println("말을 해요!");
	}
	//추상 메소드
	public abstract void dance();
}













