package ex1;

/*
 * �͸� Ŭ����
 * - �̸��� ���� Ŭ����
 * - ������ ��ü ������ �� �� ����.
 * - Ŭ���� ��Ӱ� �������̽� ������ �Ѱ����� ����
 * - �ݵ��� �������̵� �ؾߵ�
 * - ����� ���ÿ� ���� ���������� 
 * - ��ȸ�� Ŭ������� �����ϸ�ȴ�.
 */

interface Test07{
	public static final int x = 100;
	public abstract void add();
}
class A07 implements Test07{
	public void add(){
		
	}
}
public class Main07 {
	public static void main(String[] args){
		//Test07 t  = new A07();			 // ������ ������ ���������� �������̵� ��ü����
		Test07 t = new Test07(){
			public void add(){
				//...
			}			
		};			
	}
}
