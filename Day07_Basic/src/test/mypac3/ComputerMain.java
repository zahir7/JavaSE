package test.mypac3;

public class ComputerMain {
	//프로그램의 시작이 되는 메인 메소드
	public static void main(String[] args) {
		//Computer 객체 생성하기
		Computer com1 = new Computer();
		Computer com2 = new Computer("인텔 듀얼코어","삼성 4Giga");
		
		//com1 과 com2 객체의 차이점은 무엇일까요??
		com2.calc();
		
		
	}
}
