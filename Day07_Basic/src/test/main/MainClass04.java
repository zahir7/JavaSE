package test.main;
/*
 * final 상수만들기
 */
public class MainClass04 {
	public static void main(String[] args) {
		
		final double PI=3.14159; //원주율
		//원의 넓이 구하기
		//원의 반지름
		int r=10;
		double area=PI*r*r;
		System.out.println("원의 넓이:"+area);
		
		area=Math.PI*Math.pow(r, 2);
		System.out.println("원의 넓이:"+area);
		
		double d = Math.sin(Math.PI/6);
		System.out.println(d);
		
	}
}











