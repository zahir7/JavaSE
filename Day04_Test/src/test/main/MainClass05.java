package test.main;

import java.util.ArrayList;

public class MainClass05 {
	public static void main(String[] args) {
		//�����迭 ��ü �����ϱ� (ArrayList)
		ArrayList<String> list=new ArrayList<String>();
		list.add("����ȣ");
		list.add("ȫ�浿");
		list.add("���߳�");
		list.add("�Ѻ�");
		
		//�ݺ��� for �� �̿��ؼ� ����ϱ�
		for(int i=0 ; i < list.size() ; i=i+1){
			System.out.println(list.get(i));
		}
	}
}
