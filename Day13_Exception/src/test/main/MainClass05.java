package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		//0~9 까지 순서대로 출력하기
		
		for(int i=0; i<10 ; i++){
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				//에러정보 출력하기.
				e.printStackTrace();
				//에러정보 다른 방법으로 출력하기.
				System.out.println(e.getMessage());
			}
		}//for
	}//main()
}//class







