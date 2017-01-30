package test.main;
/*
 * 논리 연산자
 * 
 * && : and 조건, 교집합의 개념, 양쪽이 모두  true 일때만 true
 * || : or 조건, 합집합의 개념, 어느 한쪽이 true 이면 true
 * !  : not 조건, 여집합의 개념, 논리값을 반전 시킨다 
 * 		true>>false false>>true
 */
public class MainClass14 {
	public static void main(String[] args) {
		
		boolean result=true && true;
		System.out.println("&& :"+result);
		
		result = true || false;
		System.out.println("|| :"+result);
		
		result = !false;
		System.out.println(result);
		result = true || false || false || false;
		System.out.println(result);
		result = true && true && true && false;
		System.out.println(result);
	}
}










