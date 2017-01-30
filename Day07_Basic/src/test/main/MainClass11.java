package test.main;
/*
 * do ~ while() 문
 * 
 * do{
 * 	..반복수행할 문장
 * }while(조건문);
 */
public class MainClass11 {
	public static void main(String[] args) {
		int count=0;
		do{ //최소 한번은 실행된다.
			System.out.print(count+" ");
			count++;
		}while(count<100);
	}
}
