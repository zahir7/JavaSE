package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		
		String[] names={"�豸��","ȫ�浿","���߳�","������","������"};
		
		//�迭�� ���� ����غ���
		for(int i=0 ; i<names.length ; i++){
			System.out.println(names[i]);
		}
		//Ȯ�� for �� 
		for(String tmp:names){
			System.out.println(tmp);
		}
	}
}
