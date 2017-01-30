package test.main;

public class MainClass10 {
	
	//프로그램의 시작이 되는 메인 메소드
	public static void main(String[] args) {
		
		int num1 = -10 ;
		int num2 = 10 ;
		
		if(num1 > 0 || num2 > 0){ //조건1
			System.out.println("조건1이 참입니다.");
		}
		if(num1 > 0 && num2 > 0){ //조건2
			System.out.println("조건2가 참입니다.");
		}
		System.out.println("프로그램이 종료됩니다.");
	}
}
