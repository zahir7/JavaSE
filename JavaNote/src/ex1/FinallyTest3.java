package ex1;

public class FinallyTest3 {
	
	public static void main(String[] args) {
		method1();
		System.out.println("method1()�� ������ ��ġ�� main�޼��尡 ����Ǿ����ϴ�.");
	}
	static void method1(){
		try {
			System.out.println("method1()�� ȣ�� �Ǿ����ϴ�. ");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			System.out.println("method1()�� finally���� ����Ǿ����ϴ�.");
		}		
	}
}
