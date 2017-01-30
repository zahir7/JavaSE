package test.main;

public class NumberPrinter {
	
	public void printNumber() throws InterruptedException{
		//0~9까지 1초에 한번씩 찍기
		for(int i=0;i<10;i++){
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
}
