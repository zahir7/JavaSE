package ex1;
// public 모든 접근을 허용한다.
// private 한클래스 내에서만 사용 가능하다
// default 같은 패키지내에서만 접근이 가능하다.
// protected 같은 패키지 내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능하다.


public class TvTest01 {
	private		static int a = 100;
				static int b = 100;
	protected	static int c = 100;
	public  	static int d = 100;
	
	public static void main(String[] args) {
			
	}	
}
