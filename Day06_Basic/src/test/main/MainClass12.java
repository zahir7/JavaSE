package test.main;

public class MainClass12 {
	public static void main(String[] args) {
		int num=0;
		
		int result= ++num + 10 ;
		System.out.println("num:"+num);
		System.out.println("result:"+result);
		
		int num2=0;
		
		int result2= num2++ + 10 ;
		System.out.println("num:"+num2);
		System.out.println("result:"+result2);
		
		int result3 = ++num+ ++num2- --num;
	}
}









