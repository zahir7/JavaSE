package test.main;

public class MainClass06 {
	public static void main(String[] args) 
						throws InterruptedException{
		//0~9 까지 순서대로 출력하기
		
		for(int i=0; i<10 ; i++){
			System.out.println(i);
			Thread.sleep(2000);
		}//for
	}//main()
}//class







