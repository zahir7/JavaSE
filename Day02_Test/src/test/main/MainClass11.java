package test.main;

public class MainClass11 {
	
	//프로그램의 시작이 되는 메인 메소드
	public static void main(String[] args) {
		
		boolean isCommit = true;
		//카운트를 세기 위해서 변수를 선언하고 초기화 한다.
		int count = 0;
		//while 문 사용하기
		while(isCommit){
			System.out.println("#####");
			//카운트 올리기
			count = count + 1 ;
			System.out.println(count);
			if(count == 10){ // 카운트가 10 이라면
				isCommit = false;
			}
		}
		
		System.out.println("프로그램이 종료됩니다.");
	}
}




