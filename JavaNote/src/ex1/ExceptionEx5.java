package ex1;

public class ExceptionEx5 {
	public static void main(String[] args) {
		try {				
			String str = args[0];
			System.out.println(str);
			System.out.println(0/0);
		}catch (ArithmeticException e) {
			System.out.println("산술 예외 처리");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 예외 처리");
		}				
	}
}
