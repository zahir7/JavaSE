package test.main;

public class MainClass04 {
	//���α׷��� �������� �Ǵ� ���� �޼ҵ�
	public static void main(String[] args) {
		String[] names={"����ȣ","��Ӹ�","������","���","�ֵ���"};
		
		//while ���� �̿��ؼ� �迭�� ��� ���� ����غ���
		int index=0; //�迭�� �ε����� ��Ī�ϱ� ���ؼ�
		boolean isRun=true;
		
		while(isRun){
			System.out.println(names[index]);
			index = index + 1;
			if(index == 5)isRun=false;
		}
		System.out.println("--------");
		index=0;
		while(true){
			System.out.println(names[index]);
			index = index + 1;
			if(index == 5)break;
		}
		System.out.println("--------");
		
		//�ݺ��� for ����ϱ�.
		for(int i=0 ; i < 5 ; i=i+1){
			System.out.println(names[i]);
		}
		//�ݺ��� for ����ϱ�.
		for(int i=0 ; i < names.length ; i=i+1){
			System.out.println(names[i]);
		}
		
	}	
}



















