package test.main;

public class MainClass01 {
	
	public static void main(String[] args) {
		String name=new String("����ȣ");
		System.out.println(name);
		//���ο� String ��ü�� �����ȴ�.
		name = name +" ������";
		
		System.out.println(name);
		
		for(int i=0 ; i<100 ; i++){
			//�ݺ��� �������� ���ο� String ��ü�� �����ȴ�.
			//��ȿ����! 
			name = name+i;
		}
		System.out.println(name);
	}
}
















