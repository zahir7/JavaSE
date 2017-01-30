package test.main;
/*
 * 여러가지 형태의 if 문 사용해보기
 */
public class MainClass01 {
	
	public static void main(String[] args) {
		int num=11;
		
		if( num%2==0 ){
			System.out.println("num 은 짝수 입니다.");
			System.out.println("두번째 라인입니다.");
		}//if
		if( num%2!=0 ){
			System.out.println("num 은 홀수 입니다.");
			System.out.println("두번째 라인입니다.");
		}//if
		
		if( num%2==0 ){
			System.out.println("짝수 입니다.");
		}else{
			System.out.println("홀수 입니다.");
		}
		if( num%2==1 ){
			System.out.println("홀수 입니다.");
		}else{
			System.out.println("짝수 입니다.");
		}
		if( num%2==1 )
			System.out.println("홀수 입니다.");
		else
			System.out.println("짝수 입니다.");
		
		
	}//main()
}//calss







	