package ex1;

class OuterEx{
	public class InnerEx{
		int x = 5;
		
	}
}
public class InnerExOne {
	public static void main(String[] args) {
		String a = "5";
/*		if(a == String.valueOf(5)){
			System.out.println("1231");
		}else {
			System.out.println("12312315456465");
		}
*/
		System.out.println(String.valueOf(5));				
	}
}