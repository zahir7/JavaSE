package test.main;

import test.mypac.Unit;
import test.mypac.Weapon;

public class MainClass01 {
	//프로그램의 시작이 되는 메인 메소드
	public static void main(String[] args) {
		//Unit 객체 생성하기
		Unit unit=new Unit();
		
		//메소드 사용해보기
		unit.attack();
		unit.attackLand();
		unit.attackSky();
		unit.attackSea(10);
	}
}











