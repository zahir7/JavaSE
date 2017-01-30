package test.main;
/*
 * 대입 연산자
 *  = , *= , /= , += , -= , %=
 */
public class MainClass16 {
	public static void main(String[] args) {
		int num = 10;
		
		num = num + 10;
		num = num + 10;
		System.out.println(num);
		num += 10;
		num += 10;
		System.out.println(num);
		num = num - 10;
		num -= 10 ;
		
		num = num * 10;
		num *= 10;
		
		num = num / 10;
		num /= 10;
		
		num = num % 10;
		num %= 10;
		
		System.out.println(num);
	}
}











