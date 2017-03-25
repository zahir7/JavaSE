package test.main;

import java.util.ArrayList;

public class MainClass05 {
	public static void main(String[] args) {
		//가변배열 객체 생성하기 (ArrayList)
		ArrayList<String> list=new ArrayList<String>();
		list.add("김태호");
		list.add("홍길동");
		list.add("나야나");
		list.add("한빛");
		
		//반복문 for 를 이용해서 출력하기
		for(int i=0 ; i < list.size() ; i=i+1){
			System.out.println(list.get(i));
		}
	}
}
