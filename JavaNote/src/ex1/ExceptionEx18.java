package ex1;

public class ExceptionEx18 {
	public static void main(String[] args) {
		try {
			method1();			
		} catch (Exception e) {
			System.out.println("처리");
			e.printStackTrace(); //호출 스택 보여준다. 
		}		
	}
	static void method1() throws Exception {
		method2();
	}
	static void method2() throws Exception {
		throw new Exception();		
	}
	
	

}
