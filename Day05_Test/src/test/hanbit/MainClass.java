package test.hanbit;

public class MainClass {
	//프로그램의 시작점이 되는 메인 메소드
	public static void main(String[] args) {
		//OurClass 객체 생성하기
		OurClass our = new OurClass();
		String name = our.getRandomName();
		System.out.println(" 당첨된 학생:"+name);
	}
}
