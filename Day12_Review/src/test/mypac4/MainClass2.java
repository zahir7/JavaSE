package test.mypac4;

public class MainClass2 {
	//메인 메소드
	public static void main(String[] args) {
		//Weapon 추상클래스를 상속받아 추상메소드를 구현한 객체
		Weapon weapon=new Weapon(){//익명의 이너 클래스
			@Override
			public void attackSky() {
				System.out.println("공중 공격을 해요!");
			} 
		};
		weapon.attackSky();
		weapon.attack();
	}
}
