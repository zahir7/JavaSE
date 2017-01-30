package ex1;

public class StringEx51 {
	public static void main(String[] args) {
		String s1 = "Wonnder Girls";
		
		int index = s1.indexOf('n');
		System.out.println("맨 처음 문자 n의 위치 : "+ index);
		
		index = s1.indexOf("der");
		System.out.println("문자 der의 위치 : " + index);
		
		index = s1.lastIndexOf('n');
		System.out.println("마지만 문자 n의 위치 : " + index);
		
		char c = s1.charAt(index);
		System.out.println("추출한 문자 : " + c);
		
		index = s1.indexOf('G');
		String str = s1.substring(index);
		System.out.println("G로부터 끝까지 잘라내기 : " + str);
		
		str = s1.substring(index, index+3);
		System.out.println("G로부터 3자까지 잘라내기 : " + str);
		
		int length = s1.length();
		System.out.println("s1의 길이 : " + length);
		
		String[] arr = s1.split(" ");
		for(int i = 0; i < arr.length; i++){
			System.out.println("arr["+i+"] : "+arr[i]);
		}
	}
}
