package test.mypac;
//인터페이스 구현하기
//1. implements 인터페이스 명
//2. 구현되지 않은 추상메소드를 구현한다.

public class Unit implements Weapon{

	@Override
	public void attack() {
		System.out.println("공격을 해요!");
	}
	@Override
	public int attackLand() {
		System.out.println("지상 공격을 해요!");
		return 0;
	}
	@Override
	public String attackSky() {
		System.out.println("공중 공격을 해요!");
		return null;
	}
	@Override
	public void attackSea(int demage) {
		System.out.println("바다 공격을 해요!");
	}
}







