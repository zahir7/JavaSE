package test.main;
/*
 *  비교 연산자
 *  
 *  > 	: 크다
 *  >= 	: 크거나 같다
 *  < 	: 작다
 *  <=	: 작거나 같다
 *  == 	: 같다
 *  != 	: 다르다
 */
public class MainClass13 {
	public static void main(String[] args) {
		
		boolean result = 10 > 20;
		System.out.println(result);
		
		result = 10 <= 20;
		if(result)
			System.out.println("10 은 20 보다 작거나 같아요!");
		
		result = 10 == 10;
		if(result)
			System.out.println("10 과 10 은  같아요");
		
		result = 10 != 20;
		if(result)
			System.out.println("10 과 10 은 달라요 ");
		
	}
}












