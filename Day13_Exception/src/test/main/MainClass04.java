package test.main;
/*
 * [[ Exception �� ���� ]]
 * 
 * 1.Checked Exception
 * -�����Ͻÿ� �ݵ�� try~catch �� ó���ؾ��Ѵ�.
 * 2.UnChecked Exception
 * -try~catch �� ó������ �ʾƵ� �����Ͻÿ� ������ �߻����� ����
 * -���������� ó���ϸ�ȴ�.
 */
public class MainClass04 {
	public static void main(String[] args) {
		//0~9 ���� ������� ����ϱ�
		
		for(int i=0; i<10 ; i++){
			System.out.println(i);
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ie){
				System.out.println("�ͼ��ǹ߻�!");
			}
		}//for
	}//main()
}//class
