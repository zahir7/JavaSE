package ex1;


/*
 * 쓰레드가 작업을하고...
 * 메인에서는 쓰레드 컨트롤하는 작업을 한다!!
 */
class ThreadEx16 {
	public static void main(String[] args) {
		RunImplEx16 r = new RunImplEx16();
		Thread th1 = new Thread(r, "*");
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");
		th1.start();
		th2.start();
		th3.start();
		try {
			Thread.sleep(2000);
			th1.suspend(); // 쓰레드 th1을 잠시 중단시킨다. sleep과 차이는 누군가 호출해줄때까지 멈춰있는다.
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume(); // 쓰레드 th1이 다시 동작하도록 한다.
			Thread.sleep(3000);
			th1.stop(); // 쓰레드 th1을 강제종료시킨다.
			th2.stop();
			Thread.sleep(2000);
			th3.stop();			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}//main
}
class RunImplEx16 implements Runnable{
	@Override
	public void run() {
		while(true){
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}		
	}//run()	
}