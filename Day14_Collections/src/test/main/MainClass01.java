package test.main;

import java.util.Stack;

/*
 *  [[ Stack Class ]] 
 *  
 *  -������ ���� : �������� ����
 */
public class MainClass01 {
	private int a;
	
	
	MainClass01(int a){
		this.a = a;
		String[] aaa = {"aa" , "bb"};
		
	}
	
	
	public static void main(String[] args) {
		//Stack ��ü �����ϱ�
		Stack<String> stack=new Stack<String>();	
		
		
		//������ ��ü�� �ڷ� �����ϱ�
		stack.push("����ȣ");
		stack.push("ȫ�浿");
		stack.push("���߳�");
		
		//���� �����ϰ� �ִ� �������� ������ ����ϸ�
		System.out.println("�������� ����:"+stack.size());
		
		//������ �ϳ��� ������
		System.out.println("1:"+stack.pop());
		System.out.println("2:"+stack.pop());
		System.out.println("3:"+stack.pop());
		//System.out.println("4:"+stack.pop());
		//���� ���� �������� ������?
		System.out.println("�������� ����:"+stack.size());
		//�ٽ� �����͸� ��������
		stack.push("����ȣ");
		stack.push("ȫ�浿");
		stack.push("���߳�");
		//�������� �ִ� �����͸� ����Ϸ���
		System.out.println("���� ���� �ִ� ������:"+stack.peek());
		//����� ��� �����͸� pop() �ϸ鼭 ����غ���
		while(!stack.empty()){
			String name=stack.pop();
			System.out.println("pop �� ������:"+name);
		}
		
	}
}











