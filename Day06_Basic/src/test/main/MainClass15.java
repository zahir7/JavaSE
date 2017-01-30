package test.main;
/*
 * 임의의 정수를 입력받아서 100 ~ 200 사이의 수이면 
 * 특정 메세지를 출력하는 예제
 */
public class MainClass15 {
	public static void main(String[] args) {
		int num = 250;
		if( num > 100 && num < 200){
			System.out.println("num 은 100 ~ 200 사이의 수입니다.");
		}
	}
}
