package test.main;
/*
 * A : 65
 * a : 97 
 */
public class MainClass03 {
	public static void main(String[] args) {
		//A ~ Z 반복문을 이용해서 출력해보세요.
		for(int i=65 ; i <= 90 ;i=i+1){
			
			char ch = (char)i;
			System.out.print(ch);
		}
		System.out.println();// 개행
		
		//a ~ z 반복문을 이용해서 출력해보세요.
		for(int i=97 ; i <= 122 ; i=i+1){
			char ch = (char)i;
			System.out.print(ch);
		}
	}
}










