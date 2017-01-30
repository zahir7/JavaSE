package test.main;

public class MainClass13 {
	//프로그램의 시작이 되는 메인 메소드
	public static void main(String[] args) {
		sing(); //메소드 호출하기.
		singAsong("애국가");
	}
	public static void sing(){
		System.out.println("노래를 불러요!");
	}
	
	public static void singAsong(String songName){
		
		System.out.println(songName+" 이란 노래를 불러요!");
	}
}
