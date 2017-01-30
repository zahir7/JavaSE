package test.mypac;
//인터 페이스 만들기
//구성요소
//1.final 상수
//2.추상 메소드(구현되지 않은 메소드)
public interface Weapon {
	
	//공격하는 추상 메소드
	public void attack();
	public int attackLand();
	public String attackSky();
	public void attackSea(int demage);
}
