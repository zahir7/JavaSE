package test.main;
/*
 * 1.프로모션(업 캐스팅)
 * 	-표현 범위가 더 큰 데이터형으로 변환하기
 * 	-자동으로 된다.
 * 	-데이터의 손실이 없다.
 * 2.디모션(다운 캐스팅)
 * 	-표현 범위가 더 작은 데이터 형으로 변환하기
 * 	-명시적으로 해야한다
 * 	-데이터의 손실이 있을수 있다.
 */
public class MainClass06 {
	//프로 그램의 시작이 되는 메인 메소드
	public static void main(String[] args) {
		//프로 모션의 예
		byte iByte = 10;
		int iInt = iByte; //자동으로 형변환이 된다.
		
		float iFloat = 10.1f;
		double iDouble = iFloat; //자동으로 형변환이 된다.
		
		//디모션의 예
		float iFloat2 = (float)iDouble;
		
	}
}
















