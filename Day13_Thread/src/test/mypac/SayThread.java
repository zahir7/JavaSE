package test.mypac;

import java.util.Random;

public class SayThread extends Thread{
	
	String[] msg={"�ȳ�","�ɽ���","�����","�� ���ܿ�","����",
			"�񸻶�","����������?","���� �ɷȾ�","��ȭ�´�.","..."};
	
	@Override
	public void run() {
		Random ran=new Random();
		while(true){//���� ������ �����.
			//0~9 ������ ���߿��� ������ ���� �����Ѵ�.
			int ranNum=ran.nextInt(10);
			//�迭���� �������� ������ ��ȣ�� �ش��ϴ� �ε��� ���� �о�ͼ�
			//����Ѵ�.
			System.out.println(msg[ranNum]);
			try {
				Thread.sleep(5000);//���ֱ� 5�ʾ� ����.
			} catch (InterruptedException e) {}
		}//while
	}//run()
}



