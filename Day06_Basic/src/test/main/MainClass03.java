package test.main;
/*
 * A : 65
 * a : 97 
 */
public class MainClass03 {
	public static void main(String[] args) {
		//A ~ Z �ݺ����� �̿��ؼ� ����غ�����.
		for(int i=65 ; i <= 90 ;i=i+1){
			
			char ch = (char)i;
			System.out.print(ch);
		}
		System.out.println();// ����
		
		//a ~ z �ݺ����� �̿��ؼ� ����غ�����.
		for(int i=97 ; i <= 122 ; i=i+1){
			char ch = (char)i;
			System.out.print(ch);
		}
	}
}










