package test.main;

public class MainClass03 {
	
	public static void main(String[] args) {
		//String 을 담을수 있는 방 10 개짜리 배열 객체 생성해서 변수에 담기
		String[] names = new String[10];
		
		names[0] = "김구라";
		names[1] = "홍길동";
		names[2] = "나야나";
		names[3] = "한빛";
		names[4] = "차유람";
		names[9] = "마지막";
		
		String str = names[9];
		System.out.println(str);
	}
}
