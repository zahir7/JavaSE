package test.mypac2;
/*
 * 추상 클래스 상속 받기
 */
public class WonderWoman extends Woman{

	@Override
	public void dance(Man man) {
		if( man.getHeight()<178 ){
			System.out.println("키가 넘 작아! 너랑 춤안춰!!");
			return;//메소드를 끝내라
		}
		System.out.println("남자와 여자가 춤을 춰요!");
	}
	
}
