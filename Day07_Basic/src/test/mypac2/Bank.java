package test.mypac2;

import java.util.HashMap;

/*
 * ������ ���� Ŭ���� �����.
 */
public class Bank {
	//final  ��� �����ϱ�
	public final String NAME="��������";
	public String branch; //����
	public int totalMoney; //��ü ��ġ�� �ݾ�
	public HashMap<String,Integer> map=
							new HashMap<String,Integer>();
	//������ �����ϱ�
	public Bank(String branch){
		//�����ڿ��� ���ڷ� �޾ƿ� �������� �ڽ��� �ɹ� �ʵ忡 �����ϱ�
		this.branch=branch;
	}
	
}









