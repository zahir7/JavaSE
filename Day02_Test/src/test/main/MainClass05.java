package test.main;

public class MainClass05 {
	static int number=100;
	
	//메인메소드 (Method) 
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		dance();
		System.out.println(number);
		System.out.println("메인 메소드가 종료 됩니다.");
	}
	
	public static void dance(){
		System.out.println(number);
		System.out.println("춤을 춰요!");
	}
	
	public static void sing(){
		System.out.println("노래를 불러요!");
	}
}
