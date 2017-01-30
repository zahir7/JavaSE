package test.main;

import java.util.ArrayList;

/*
 * [[ ArrayList Class ]]
 * 
 *  -가변 배열이다.
	-인덱스 값이 있다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		//ArrayList 객체 생성하기
		ArrayList<String> list=new ArrayList<String>();
		//데이터 저장하기
		list.add("김구라");
		list.add("홍길동");
		list.add("나야나");
		//저장된 데이터의 특정 인덱스값 얻어오기
		String str=list.get(0);
		System.out.println(str);
		//저장된 데이터에서 특정 인덱스의 내용 삭제하기
		list.remove(2); //2번째 인덱스 값 삭제하기
		//저장된 데이터의 갯수를 얻어오려면?
		int num=list.size();
		System.out.println("저장된 데이터의 갯수:"+num);
		System.out.println(list);
	}
}












