package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		
		boolean isWait = true;
		boolean isRun = true;
		
		if(isWait || isRun){
			System.out.println("OR ������ ���Դϴ�.");
		}
		if(isWait && isRun){
			System.out.println("AND ������ ���Դϴ�.");
		}
		System.out.println("���θ޼ҵ尡 ����˴ϴ�.");
	}
}
