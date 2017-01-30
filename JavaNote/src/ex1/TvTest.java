package ex1;

// 하나라도 추상메서드가 있으면 그 클래스는 추상클래스가 되어야 한다.
// 미완성된 추상클래스는 객체를 생성할 수 없다.
// 추상클래스란 미완성된 설계도.

abstract class Tv01{
	int x = 100;
	abstract void channelUp(); //선언부
	/*
	void channelUp(){ //선언부
		//.. 구현부  {} <-- 중괄호 자체를 구현부라고한다. 
	}
	*/
}

// 상속받은 자손클래스는 조상클래스가 가지고있는 추상매서드를 반드시!! 오버라이딩 해야한다.
class VideoTv extends Tv01{
	@Override
	void channelUp() {
		
	}
}

public class TvTest {
	public static void main(String[] args) {		
	}
}