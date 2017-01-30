package ex1;


/*
 * �����尡 �۾����ϰ�...
 * ���ο����� ������ ��Ʈ���ϴ� �۾��� �Ѵ�!!
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
			th1.suspend(); // ������ th1�� ��� �ߴܽ�Ų��. sleep�� ���̴� ������ ȣ�����ٶ����� �����ִ´�.
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume(); // ������ th1�� �ٽ� �����ϵ��� �Ѵ�.
			Thread.sleep(3000);
			th1.stop(); // ������ th1�� ���������Ų��.
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