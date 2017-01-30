package test.main;

import test.mypac.Human;
import test.mypac.Man;
import test.mypac.Woman;

public class MainClass01 {
	//프로그램의 시작이 되는 메인 메소드
	public static void main(String[] args) {
		//Human 클래스를 이용해서 객체 생성하기
		Human human=new Human();
		human.say();
		
		//Man 클래스를 이용해서 객체 생성하기
		Man man=new Man();
		man.say();
		man.fight();
		
		//Woman 클래스를 이용해서 객체 생성하기
		Woman woman=new Woman();
		woman.makeup();
	}
}















