package test.main;

public class MainClass14 {
	//프로그램의 시작이 되는 메인 메소드
	public static void main(String[] args) {
		dance();
		dance("람바다");
		dance("살사",10);
	}
	
	public static void dance(){
		System.out.println("춤을 추어요!");
	}
	public static void dance(String danceName){
		System.out.println(danceName+" 이란 춤을 추어요!");
	}
	public static void dance(String danceName , int num){
		System.out.println(danceName+" 춤을 "+num+" 번 추어요!");
	}
}







