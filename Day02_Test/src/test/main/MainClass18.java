package test.main;

public class MainClass18 {
	//프로그램의 시작이 되는 메인 메소드
	public static void main(String[] args) {
		
		int result = getSum(1, 2);
		System.out.println("결과:"+result);
		
		double result2 = getSum(10.9 , 10.1);
		
		System.out.println(result2);
	}
	//인자로 전달되는 두 정수를 더한후 결과 값을 리턴하는 메소드
	public static int getSum(int a , int b){
		int sum = a+b;
		
		return sum;
	}
	//인자로 전달되는 두 실수를 더한후 결과 값을 리턴하는 메소드를 만들어보세요
	public static double getSum(double a,double b){
		double sum = a+b;
		return sum;
	}
}







