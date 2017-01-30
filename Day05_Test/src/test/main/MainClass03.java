package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		String num="100";
		//문자열을 숫자(정수)로 바꾸기
		int parsedNum = Integer.parseInt(num);
		int result = 100 + parsedNum;
		System.out.println("정수:"+result);
		
		String str = Integer.toString(result);
		
		System.out.println("문자열:"+str);
		
	}
}
