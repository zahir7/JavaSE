package test.main;
/*
 * 문자열(String) 을  계속 변화시키거나 내용을 덛붙이고자 할때는
 * 
 * [[ StringBuilder , StringBuilder Class ]] 를 사용한다.
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		//StringBuilder 객체 생성하기
		StringBuilder sBuff=new StringBuilder();
		//문자열 추가하기
		sBuff.append("김태호");
		sBuff.append(" 선생님");
		sBuff.append("!");
		//저장된 문자열 읽어오기
		String msg=sBuff.toString();
		//출력해보기
		System.out.println(msg);
		
		//StringBuilder 객체 생성하기.
		StringBuilder sbuilder=new StringBuilder();
		sbuilder.append(msg); //문자열 추가
		
		for(int i=0 ; i<100 ; i++){
			sbuilder.append(i);
		}
		//저장된 문자열 출력해보기.
		System.out.println(sbuilder.toString());
	}
}











