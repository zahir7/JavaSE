package test.main;
/*
 * Wrapper 클래스
 * 
 * -정수형
 * byte 	: Byte
 * short 	: Short
 * int 		: Integer
 * long 	: Long
 * char		: Char
 * 
 * -실수형
 * float 	: Float
 * double 	: Double
 * 
 */
public class MainClass12 {
	public static void main(String[] args) {
		int num1 = 10;
		Integer num2 = 10;
		int sum = num1+num2;
		System.out.println("num1+num2="+sum);
		
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		
		String stringNum="100";
		
		int parsedNum = Integer.parseInt("100");
		String str = Integer.toString(1000);
		
		System.out.println(max);
		System.out.println(min);
		
	}
}





























