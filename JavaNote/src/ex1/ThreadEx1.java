package ex1;

class ThreadEx1 {
	
	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		t1.start(); //start() �޼ҵ尡  run �޼ҵ带 ȣ���Ѵ�.
		t2.start();
		System.out.println("���� ����");
			
	}
}
class ThreadEx1_1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());
		}
		System.out.println("t1 ����");		
		
	}
}
class ThreadEx1_2 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("t2 ����");
		
	}
}
