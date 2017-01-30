package test.main;
/*
 * 증감 연산자
 * 
 * ++ : 1 씩 증가 시킨다
 * -- : 1 씩 감소 시킨다.
 */
public class MainClass11 {
	public static void main(String[] args) {
		int num=0;
		num = num + 1;
		System.out.println("1 증가 시킨후:"+num);
		num++;
		System.out.println("1 증가 시킨후:"+num);
		
		//0~99 까지 출력하는 for문
		for(int i=0 ; i < 100 ; i++){
			
			System.out.print(i+" ");
		}
		System.out.println();
		//변수의 값을 1씩 감소 시키기
		int num2=0;
		num2 = num2 - 1;
		System.out.println("1감소 시킨후:"+num2);
		num2--;
		System.out.println("1감소 시킨후:"+num2);
		
		//99 ~ 0 까지 출력하기 위한 for 문
		for(int i=99 ; i >= 0 ; i--){
			
			System.out.print(i+" ");
		
		}
		
	}
}












