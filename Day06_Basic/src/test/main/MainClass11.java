package test.main;
/*
 * ���� ������
 * 
 * ++ : 1 �� ���� ��Ų��
 * -- : 1 �� ���� ��Ų��.
 */
public class MainClass11 {
	public static void main(String[] args) {
		int num=0;
		num = num + 1;
		System.out.println("1 ���� ��Ų��:"+num);
		num++;
		System.out.println("1 ���� ��Ų��:"+num);
		
		//0~99 ���� ����ϴ� for��
		for(int i=0 ; i < 100 ; i++){
			
			System.out.print(i+" ");
		}
		System.out.println();
		//������ ���� 1�� ���� ��Ű��
		int num2=0;
		num2 = num2 - 1;
		System.out.println("1���� ��Ų��:"+num2);
		num2--;
		System.out.println("1���� ��Ų��:"+num2);
		
		//99 ~ 0 ���� ����ϱ� ���� for ��
		for(int i=99 ; i >= 0 ; i--){
			
			System.out.print(i+" ");
		
		}
		
	}
}












