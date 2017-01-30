package test.main;
/*
 * 산술 연산자를 이용한 예제
 */
public class MainClass10 {
	public static void main(String[] args) {
		int kor=100;//국어 점수
		int eng=97; //영어점수
		int sum=kor+eng;
		
		//평균을 구하기 위해서는 실수형 데이터형이 필요하다.
		double ave1 = sum / 2;
		double ave2 = sum / 2.0;
		double ave3 = ((double)sum) / 2;
		//출력해보기
		System.out.println("총점:"+sum);
		System.out.println("ave1:"+ave1);
		System.out.println("ave2:"+ave2);
		System.out.println("ave3:"+ave3);
	}
}






