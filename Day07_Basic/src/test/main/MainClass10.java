package test.main;
/*
 * �ݺ��� while
 * 
 * while(���ǹ�){
 * 	..�ݺ� ������ ����.
 * }
 */
public class MainClass10 {
	public static void main(String[] args) {
		//while ���� �̿��ؼ� 0~99 ���� ����غ���
		int count=0; //ī��Ʈ�� ���� ���� ����.
		while(true){
			System.out.print(count+" ");
			count++; //ī��Ʈ ����
			if(count==100)break;
		}//while
		System.out.println();//�����ϱ�
		/*
		 * �ٸ� ���·� ����� �Ѵٸ�...
		 */
		count=0; //ī��Ʈ �ʱ�ȭ
		boolean isRun=true;
		while(isRun){
			System.out.print(count+" ");
			count++;
			if(count==100)isRun=false;
		}
		System.out.println();//�����ϱ�
		count=0;//ī��Ʈ �ʱ�ȭ
		while( count<100 ){
			System.out.print(count+" ");
			count++;
		}
		
	}//main
}//class











