package ex1;

public class Main01 {

	public static void main(String[] args) {
		Test01 t1 = new Test01();
		
		// 변수를 보호하기위한 유효성 검사
		// t1.score = 500; //private라 쓸수 없음 
		t1.setScore(55); //메소드 통해 우회접근 변경가능
		System.out.println(t1.getScore());
	}
}
