package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		
		boolean isWait = true;
		boolean isRun = true;
		
		if(isWait || isRun){
			System.out.println("OR 조건이 참입니다.");
		}
		if(isWait && isRun){
			System.out.println("AND 조건이 참입니다.");
		}
		System.out.println("메인메소드가 종료됩니다.");
	}
}
