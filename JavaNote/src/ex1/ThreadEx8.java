package ex1;

import javax.swing.JOptionPane;

class ThreadEx8 {
	static boolean inputCheck = false;
	
	public static void main(String[] args) throws Exception {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		th1.start();
		th2.start();
	}
}
class ThreadEx8_1 extends Thread {
	public void run(){
		System.out.println("10�� �ȿ� ���� �Է��ؾ� �մϴ�.");		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���."); 		
		ThreadEx8.inputCheck = true;
		System.out.println("�Է°��� "+input+"�Դϴ�.");
	}
}
class ThreadEx8_2 extends Thread {
	public void run() {
		for (int i = 10; i >= 0  ; i--) {
			if(ThreadEx8.inputCheck) return;
			System.out.println(i);

			try {
				sleep(1000);
			} catch(InterruptedException e ) {}
		}
		System.out.println("10�� ���� ���� �Էµ��� �ʾ� �����մϴ�.");
		System.exit(0);		
	}
}
