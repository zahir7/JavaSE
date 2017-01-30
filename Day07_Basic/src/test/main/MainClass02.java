package test.main;
/*
 * 여러가지 형태의 if 문 사용하기
 */
public class MainClass02 {
	public static void main(String[] args) {
		int num=4;
		//어떤 수를 3으로 나눈 나머지를 출력하기
		if( num%3==0){
			System.out.println("나머지가 0입니다.");
		}else if( num%3==1 ){
			System.out.println("나머지가 1입니다.");
		}else{
			System.out.println("나머지가 2입니다.");
		}
	}
}
