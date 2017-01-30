package ex1;

public class FinallyTest3 {
	
	public static void main(String[] args) {
		method1();
		System.out.println("method1()의 수행을 마치고 main메서드가 실행되었습니다.");
	}
	static void method1(){
		try {
			System.out.println("method1()이 호출 되었습니다. ");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			System.out.println("method1()의 finally블럭이 실행되었습니다.");
		}		
	}
}
