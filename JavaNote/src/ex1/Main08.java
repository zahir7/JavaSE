package ex1;
class Tv08{
	static int x = 10; 					// 클래스 기본형 변수
	static Video08 v1 = new Video08();  // 클래스 참조형 변수
	int x2 = 20;						// 인스턴스 기본형 변수
	String str = "hello"; 				// 인스턴스 참조형 변수
}
class Video08{
	int y = 100;
}
public class Main08 {
	public static void main(String[] args) {		
		System.out.println(Tv08.x);
		System.out.println(Tv08.v1.y);
		
		Tv08 t1 = new Tv08();
		System.out.println(t1.x2);
		
		try {
			int result = t1.str.codePointAt(100);
			System.out.println(result);
		} catch (Exception e) {		
			System.out.println("해당 범위에 값이 없음.");
			e.printStackTrace();
		}
		
		
	}

}
