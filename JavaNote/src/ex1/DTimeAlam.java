package ex1;

import javax.swing.JOptionPane;

class DTimeAlam {
	static boolean timeCheck = false;
	public static void main(String[] args) {
		Alam alm = new Alam();
		CountTime ct = new CountTime();
		//alm.start();
		alm.start();
		ct.start();
		
	}
}
class Alam extends Thread{
	@Override
	public void run() {
		//DTimeAlam.timeCheck = true;
		JOptionPane.showMessageDialog(null,"xxxx");;	
	}
}
class CountTime extends Thread{
	@Override
	public void run() {
		for (int i = 10; i >=0 ; i--) {
			//if(DTimeAlam.timeCheck) return;
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {				
				e.printStackTrace();
			}
		}
		
		//System.out.println("yyyyyy");
		System.exit(0);
	
	}
}
