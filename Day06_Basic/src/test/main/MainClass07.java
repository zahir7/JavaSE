package test.main;
/*
 * [[ 참조데이터형(레퍼런스형) ]]
 * String 형
 * -선언하는 방법
 * 	String 변수명;
 * 	-문자열을 저장할수 있다.
 */
public class MainClass07 {
	public static void main(String[] args) {
		//변수 선언과 동시에 값 대입하기
		String str = "서울 특별시 종로구 숭인동";
		boolean isContain = str.contains("특별시");
		if(isContain){
			System.out.println("str 에는 특별시 라는 문자열이 있어요");
		}
		System.out.println("4번째 인덱스:"+str.charAt(3));
		
		//변수에 저장된 내용을 문자열로 출력해보기.
		System.out.println(str);
	}
}
