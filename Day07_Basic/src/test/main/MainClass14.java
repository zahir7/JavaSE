package test.main;

public class MainClass14 {
	//���α׷��� ������ �Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		String[] names={"�ڼ���","������","������","�Ѻ���","�ڹμ�",
				"������","�����","�载��","����","�뼺��",
				"����ȣ","�迬��","�ֿ뱺","�����","������",
				"���ƶ�","������","������","������","��ȿ��","���ر�"};
		//�ݺ��� ���鼭 ��� �л��� �̸��� ����غ�����!
		for(int i=0 ; i < 21 ; i++){
			System.out.print( names[i]+" " );
		}
		System.out.println();//�����ϱ�
		
		for(int i=0 ; i < names.length ; i++){
			System.out.print( names[i]+" " );
		}
		System.out.println();
		//Ȯ�� for ���� �̿��ؼ� ����ϱ�
		//for(�迭�� ����Ǿ� �ִ� ������ �� tmp : �迭��ü)
		for(String tmp : names){
			System.out.print(tmp+" ");
		}
		
	}
}





















