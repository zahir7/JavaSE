package ex1;

public class TvMain01 {

	public static void main(String[] args) {
	//	System.out.println(Tv.a); // private 한클래스에서만 사용가능
		System.out.println(TvTest01.b); // default 같은 패키지 내에서 가능
		System.out.println(TvTest01.c); // protected 같은 패키지 또는 상속관계가 맺어 졌을때
		System.out.println(TvTest01.d); // public 모든 접근 가능.

	}

}
