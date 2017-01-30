package test.mypac;

public interface Weapon {
	final static String NAME="무기";
	//구현되지 않은 추상메소드만 올수 있고 멤버 필드로는 
	//final static 만 올수 있다
	public void attack();
	public void attackSky();
}
