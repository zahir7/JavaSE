package ex1;

public class StringEx1 {
	public static void main(String[] args) {
		// jvm�� �������� �ִ°�� ���� ������ �ʴ´�.
		// str1,2 �� ���� �ּҸ� ������ �ִ�.
		String str1 = "abc";
		String str2 = "abc";		
		
		if(str1 == str2){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		if(str1.equals(str2)){
			System.out.println("true");		
		}else{
			System.out.println("false");			
		}	
		
		// new�� ���� ���Ӱ� ����� str3, str4�� ���δٸ� �ּҸ� �������ִ�.
		// �񱳿����� '=' �ش纯���� ������ �ִ� �ּҸ� ���ϰ� StringŬ������ equals()�� ��������Ǿ� ������ �����Ͱ��� ���Ѵ�.
		String str3 = new String("abc");
		String str4 = new String("abc");		
		
		if(str3 == str4){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		if(str3.equals(str4)){
			System.out.println("true");		
		}else{
			System.out.println("false");			
		}
	}
}
