package ex1;

public class ExceptionEx18 {
	public static void main(String[] args) {
		try {
			method1();			
		} catch (Exception e) {
			System.out.println("ó��");
			e.printStackTrace(); //ȣ�� ���� �����ش�. 
		}		
	}
	static void method1() throws Exception {
		method2();
	}
	static void method2() throws Exception {
		throw new Exception();		
	}
	
	

}
