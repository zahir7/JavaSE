package ex1;

// 객체생성을 못하게 한다... 
// 이런 방식을 싱글 인스턴스방식 이라고한다
class TvTest02{
	int x = 100;
	private TvTest02(){}
	private static TvTest02 t = new TvTest02();
	public static TvTest02 getInstance(){
		return t;
	}	
}
class Main02 {
	public static void main(String[] args) {
//		TvTest02 t1 = new Test02(); //생성자를 접근할 수 없다.	
		TvTest02 t1 = TvTest02.getInstance();
		TvTest02 t2 = TvTest02.getInstance();
		t1.x = 400;
		System.out.println(t1.x);
		System.out.println(t2.x);
	}
}
