package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		//final 상수 정의 하기
		final int FIST=0;
		final int SWORD=1;
		final int GUN=2;
		//무기를 종류를 저장할 변수 선언하고 값 대입하기
		int weapon=FIST; //처음 사용할 무기 지정하기
		
		//저장된 무기의 종류에 따라서 다른 동작을 하게 하기 위해서
		switch(weapon){
		case FIST :
			System.out.println("주먹으로 공격!");break;
		case SWORD :
			System.out.println("칼로 공격!");break;
		case GUN :
			System.out.println("총으로 공격!");break;
		}//switch()
	}//main
}//calss



