package test.mypac;
/*
 * 0~9 까지 1초에 한번씩 세는 스레드
 */
public class CountThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}//for
		System.out.println("CountThread 종료!");
	}//run()
}
