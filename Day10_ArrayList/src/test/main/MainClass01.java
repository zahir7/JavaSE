package test.main;

import java.util.ArrayList;

import test.dto.Member;

/*
 * 가변 배열 : ArrayList 객체 사용해보기.
 */
public class MainClass01 {
	public static void main(String[] args) {
		//ArrayList 객체 생성하기.
		ArrayList<String> strList=
					new ArrayList<String>(); 
		//생성한 객체에 데이터 추가 하기
		strList.add("김태호");
		strList.add("홍길동");
		strList.add("나야나");
		strList.add(new String("한빛"));
		String str="원숭이";
		strList.add(str);
		
		//객체에 저장된 내용 출력해보기
		for(int i=0 ; i < strList.size() ; i++){
			System.out.println(strList.get(i));
		}
	}
}











