package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		//0~9 ���� ������� ����ϱ�
		
		for(int i=0; i<10 ; i++){
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				//�������� ����ϱ�.
				e.printStackTrace();
				//�������� �ٸ� ������� ����ϱ�.
				System.out.println(e.getMessage());
			}
		}//for
	}//main()
}//class







