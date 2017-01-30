package test.main;
/*
 * [[ 기본 자료형 ]]
 * 1.논리형(boolean)
 * -선언하는 방법
 * -boolean 변수명;
 * -가질수 있는 범위 : true , false 두가지를 저장할수 있다.
 */
public class MainClass01 {
	//프로그램의 시작이 되는 메인 메소드
	public static void main(String[] args) {
	
		//논리형 지역변수 선언하기
		boolean isWait;
		//선언한 변수에 값 대입하기
		isWait=true;
		//저장된 값을 문자열로 출력해보기
		System.out.println("논리형 변수에 저장된 값:"+isWait);
		
		//지역변수는 일반적으로 선언과 동시에 값을 넣어주어야 한다.
		boolean canRun=false; //변수 선언과 동시에 값 대입
		
		//변수에 저장된 값은 실행 도중에 바꿀수 있다
		isWait = false; //한번 선언한 변수는 다시 선언하면 안된다.
		canRun = true;
	}
}











