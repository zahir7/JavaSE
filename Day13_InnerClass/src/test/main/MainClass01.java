package test.main;

public class MainClass01 {
	
	public static void main(String[] args) {
		//���� Ŭ������ �̿��ؼ� ��ü ������ �޼ҵ� ����ϱ�.
		new InnerClass().doSomething();
	}
	static class InnerClass{
		//�޼ҵ� 
		public void doSomething(){
			System.out.println("���𰡸� �ؿ�!");
		}
	}
}
























