package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		//boolean 형 변수 선언하고 대입하기.
		boolean isWait=true;
		boolean isRun=true;
		
		System.out.println(isWait);
		System.out.println(isRun);
		
		
		
		if(true){
			System.out.println("********");
			System.out.println("********");
			System.out.println("********");
		}
		if(isWait){
			System.out.println("기다립니다.");
		}
		if(isRun){
			System.out.println("막 달려요!");
		}
		
		if(true)
			System.out.println("********");
		
		if(isWait)
			System.out.println("기다립니다.");
		
		if(isRun)
			System.out.println("막 달려요!");
		
	}
}







