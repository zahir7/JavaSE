package ex1;

public class StringEx1 {
	public static void main(String[] args) {
		// jvm은 같은값이 있는경우 새로 만들지 않는다.
		// str1,2 는 같은 주소를 가지고 있다.
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
		
		// new로 통해 새롭게 만들면 str3, str4는 서로다른 주소를 가지고있다.
		// 비교연산자 '=' 해당변수가 가지고 있는 주소를 비교하고 String클래스의 equals()는 오버라딩되어 변수의 데이터값을 비교한다.
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
