package test.mypac;

import java.util.Random;

public class IRandom extends Random{
	
	//������ ���� �����ؼ� �����ϴ� �޼ҵ�
	public int getRandomNum(){
		//0~9 ������ ���߿��� ������ ������ �����Ѵ�.
		int ranNum=nextInt(10);
		return ranNum;//������ ������ ����
	}
}
