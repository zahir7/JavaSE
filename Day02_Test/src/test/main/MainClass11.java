package test.main;

public class MainClass11 {
	
	//���α׷��� ������ �Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		
		boolean isCommit = true;
		//ī��Ʈ�� ���� ���ؼ� ������ �����ϰ� �ʱ�ȭ �Ѵ�.
		int count = 0;
		//while �� ����ϱ�
		while(isCommit){
			System.out.println("#####");
			//ī��Ʈ �ø���
			count = count + 1 ;
			System.out.println(count);
			if(count == 10){ // ī��Ʈ�� 10 �̶��
				isCommit = false;
			}
		}
		
		System.out.println("���α׷��� ����˴ϴ�.");
	}
}




